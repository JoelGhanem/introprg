/*Una classe contenidor que simplement realitzarà accessos a la base de dades.*/
import java.sql.*;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Set;
import java.sql.ResultSet;
public class Zoo {
  public int numId = 1;
  public int numIdA = 1;
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
  //determinar el id pq sino hay error en la PK
  public void determinaId() throws SQLException{
    String sql = "select id from categories order by id DESC";
    Statement st = null;
    try {
      st = conn.createStatement();
      ResultSet rs = st.executeQuery(sql);
      numId = rs.getInt("id")+1;
      rs.close();
    } finally {
      if(st!= null){
        st.close();
      }
    }
  }
  public void determinaIdA() throws SQLException {
    String sql = "select id from animals order by id desc";
    Statement st = null;
    try {
      st = conn.createStatement();
      ResultSet rs = st.executeQuery(sql);
      numIdA = rs.getInt("id")+1;
      rs.close();
    } finally {
      if (st!=null) {
        st.close();
      }
    }
  }
  //creacio de tules
  public void creaTaulaAnimals() throws SQLException {
    creaTaulaCategories();
    String sql = " CREATE TABLE IF NOT EXISTS ANIMALS (" +
    "   id      INTEGER PRIMARY KEY AUTOINCREMENT," +
    "   nom     VARCHAR(40)," +
    "   categoria integer, "+
    "   foreign key (categoria) references Categories(id))";
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
    determinaId();
    String sql = String.format( "INSERT INTO CATEGORIES (id,nom) VALUES (%d,'%s')", numId, categoria.getNom());
    categoria.setId(numId);
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

  public void afegeixAnimal(Animal animal) throws SQLException {
    determinaIdA();
    Categoria categoria = obteCategoriaPerNom(animal.getCategoria().getNom());
    if (animal.idIndefinit()) {
      if(obteCategoriaPerNom(animal.getCategoria().getNom()) == null) {
        afegeixCategoria(animal.getCategoria());
        categoria = obteCategoriaPerNom(animal.getCategoria().getNom());
      }
      animal.getCategoria().setId(categoria.getId());
      String sql = String.format(
        "INSERT INTO ANIMALS (nom, categoria) VALUES ('%s',%d)",
        animal.getNom(),animal.getCategoria().getId());
      Statement st = null;
      ResultSet rs = null;
      try {
        st = conn.createStatement();
        st.executeUpdate(sql);
        animal.setCategoria(obteCategoriaPerNom(animal.getCategoria().getNom()));
        rs = st.executeQuery("SELECT last_insert_rowid()");
        animal.setId(8);
      } finally {
        st.close();
      }
    }
  }

  public Animal obteAnimalPerNom(String nom) throws SQLException {
    String sql = "SELECT ANIMALS.id as id_animal, " +
    "ANIMALS.nom as nom_animal, " +
    "CATEGORIES.id as id_categoria, " +
    "CATEGORIES.nom as nom_categoria " +
    "FROM ANIMALS, CATEGORIES " +
    "WHERE ANIMALS.categoria = CATEGORIES.id " +
    "AND ANIMALS.nom = '" + nom + "' " +
    "ORDER BY ANIMALS.nom";

    Statement st = null;
    try {
      st = conn.createStatement();
      ResultSet rs = st.executeQuery(sql);
      if (rs.next()) {
        int idAnimal = rs.getInt("id_animal");
        String nomAnimal = rs.getString("nom_animal");
        int idCategoria = rs.getInt("id_categoria");
        String nomCategoria = rs.getString("nom_categoria");
        Categoria categoria = new Categoria(idCategoria, nomCategoria);
        Animal animal = new Animal(idAnimal, nomAnimal, categoria);
        return animal;
      }
      return null;
    } finally {
      if (st != null) {
        st.close();
      }
    }
  }  
  public List<Animal> recuperaAnimals() throws SQLException {
    String sql = "SELECT ANIMALS.id as id_animal, " +
    "ANIMALS.nom as nom_animal, " +
    "CATEGORIES.id as id_categoria, " +
    "CATEGORIES.nom as nom_categoria " +
    "FROM ANIMALS, CATEGORIES " +
    "WHERE ANIMALS.categoria = CATEGORIES.id " +
    "ORDER BY ANIMALS.nom ";   
    Statement st = null;
    try {
      st = conn.createStatement();
      ResultSet rs = st.executeQuery(sql);
      List<Animal> animals = new LinkedList<>();
      while(rs.next()){
        int idAnimals = rs.getInt("id_animal");
        String nom = rs.getString("nom_animal");
        int idCategoria = rs.getInt("id_categoria");
        String nomC = rs.getString("nom_categoria");
        Categoria categoria = new Categoria(idCategoria, nomC);
        Animal animal = new Animal(idAnimals, nom, categoria);
        animals.add(animal);
      }
      rs.close();
      return animals;
    } finally {
      if (st!= null){
        st.close();
      }

    }
  }
}
