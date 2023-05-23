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
    public void eliminaTaulaCategories() throws SQLException{
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
        categoria = obteCategoriaPerNom(categoria.getNom());
        String sql = String.format(
            "INSERT INTO CATEGORIES (nom) VALUES (%d,'%s')",categoria.getId(),
            categoria.getNom());
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
}
