/*Una classe contenidor que simplement realitzarà accessos a la base de dades.*/
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Set;
import java.sql.ResultSet;
public class Zoo {
    public int numId = 1;
    private static final String NOM_BASE_DE_DADES = "animals.bd";
    private static final String CADENA_DE_CONNEXIO = "jdbc:sqlite:" +
    NOM_BASE_DE_DADES;
    private Connection conn = null;
    public void connecta() throws SQLException {
        if (conn != null) return;   // ja connectat
        conn = DriverManager.getConnection(CADENA_DE_CONNEXIO);
    }
    public void desconnecta() throws SQLException {
        if (conn == null) return; // ja desconnectat
        conn.close();
        conn = null;
    }
    //creacio de tules
    public void creaTaulaAnimals() throws SQLException {
        creaTaulaCategories();
        String sql = " CREATE TABLE IF NOT EXISTS ANIMALS (" +
        "   id      INTEGER PRIMARY KEY AUTOINCREMENT," +
        "   nom     VARCHAR(40))";
        Statement st = null;
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }
    public void creaTaulaCategories() throws SQLException {
        String sql = "CREATE TABLE  IF NOT EXISTS CATEGORIES (" +
        "       id        INTEGER PRIMARY KEY AUTOINCREMENT," +
        "       nom       VARCHAR(40))";
        Statement st = null;
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }
    //elimina
    public void eliminaTaulaAnimals() throws SQLException {
        String sql = "DROP TABLE IF EXISTS ANIMALS";
        Statement st = null;
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }
    public void eliminaTaulaCategories() throws SQLException{
        eliminaTaulaAnimals();
        String sql = "DROP TABLE IF EXISTS CATEGORIES";
        Statement st = null;
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
        } finally {
            if (st!= null) {
                st.close();
            }
        }
    }
    public void afegeixCategoria(Categoria categoria) throws SQLException {
        String sql = String.format(
            "INSERT INTO CATEGORIES (id,nom) VALUES (%d,'%s')",numId,
            categoria.getNom());
        categoria.setId(numId);
        numId++;
        Statement st = null;
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }
    public List<Categoria> recuperaCategories() throws SQLException {
        String sql = "SELECT * FROM CATEGORIES ORDER BY nom";
        Statement st = null;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Categoria> categories = new LinkedList<>();
            while (rs.next()) {
                int bdId = rs.getInt("id");
                String nom = rs.getString("nom");
                Categoria categoria = new Categoria(bdId, nom);
                categories.add(categoria);
            }
            rs.close();
            return categories;
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }
    public Categoria obteCategoriaPerNom(String nom) throws SQLException{
        String sql = "SELECT id,nom FROM CATEGORIES WHERE NOM = '"+nom+"' ORDER BY id LIMIT 1";
        Statement st = null;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            int idC = rs.getInt("id");
            String nomC = rs.getString("nom");
            if (nomC == null) {
                return null;
            } else if (idC == 0) {
                return null;
            }
            Categoria categoria = new Categoria(idC,nomC);
            return categoria;
        } finally {
            if (st!=null) {
                st.close();
            }
        }
    }
    public String getNomTaules() throws SQLException {
        String sql = "SELECT name FROM sqlite_schema " +
        "WHERE name NOT LIKE 'sqlite%' " +
        "ORDER BY name";
        List<String> taules = new ArrayList<>();
        try (Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) { taules.add(rs.getString("name")); }
            rs.close();
        }
        return taules.size() > 0 ? String.join(", ", taules) : "cap";
    }
    public void afegeixAnimal(Animal animal) throws SQLException{
        if (animal.idIndefinit()) {
            if (obteCategoriaPerNom(animal.getNom()) != null) {
                if (obteCategoriaPerNom(animal.getNom()).getId() <= 0) {
                    //categoria nova
                    afegeixCategoria(animal.getCategoria());
                }
            }
            String sql = String.format(
                "INSERT INTO ANIMALS (nom, categoria) VALUES ('%s', '%d')",
                animal.getNom(),
                animal.getId());
        } else {
            animal.getId();
        }
    }
}
