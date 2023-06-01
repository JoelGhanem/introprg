/*Aqui fem una classe per la botiga de vins on afegim vins eliminem vins i cerquem vins per poder tenir un control sobre la quantitat de vins de la botiga*/
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.*;
public class Botiga { 
  int guardades = 0;
  private int numerito = 0;
  private int DEFAULT_MAX_VINS = 10;
  private Vi[] vins = new Vi[10];
  public Botiga() {
  }
  public Botiga(int maxVins) {
    this.vins = new Vi[maxVins];
  }
  public Vi afegeix(Vi vi){
    if (vi.getPreu() < 0) {
      return null;
    }
    if (vi.getEstoc() < 0) {
      return null;
    }
    if (vi.getNom().equals("NOM NO VÀLID!")) {
      return null;
    }
    for (int i = 0; i < vins.length; i++) {
      if (vins[i] != null)  {
        if (vins[i].getNom().equals(vi.getNom())) {
          return null;
        }
      }
    }
    for(int i = 0; i < vins.length; i++) {
      if(vins[i] == null) {
        vins[i] = vi;
        return vins[i];
      }
    }
    return null;
  }
  //BBDD
  private static final String NOM_BASE_DE_DADES = "vins.bd";
  private static final String CADENA_DE_CONNEXIO = "jdbc:sqlite:" +
  NOM_BASE_DE_DADES;
  public int numId = 1;
  public Connection conn = null;
  public void connecta() throws SQLException {
    if (conn != null) return;   // ja connectat
    conn = DriverManager.getConnection(CADENA_DE_CONNEXIO);
  }
  public void determinaId() throws SQLException{
    String sql = "select id from vins order by id DESC";
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
  public void desconnecta() throws SQLException {
    if (conn == null) return; // ja desconnectat
    conn.close();
    conn = null;
  }
  public  void creaVins() throws SQLException{
    String sql =  "CREATE TABLE  IF NOT EXISTS VINS (" +
                        "       id        INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "       nom       VARCHAR(40)," +
                        "       preu      INTEGER," +
                        "       estoc     INTEGER);";
    Statement st = null;
    try {
      st = conn.createStatement();
      st.executeUpdate(sql);
    } finally {
      if(st!= null){
        st.close();
      }
    }
  }
  public void agafaVins() throws SQLException{
    String sql = "Select * from vins";
    Statement st = null;
    try {
      st = conn.createStatement();
      ResultSet rs = st.executeQuery(sql);
      while(rs.next()) {
        int id = rs.getInt("id");
        String nom = rs.getString("nom");
        int estoc = rs.getInt("estoc");
        int preu = rs.getInt("preu");
        Vi vi = new Vi(id,nom,preu,estoc);
        numerito++;
      }
    } finally {
      if(st != null){
        st.close();
      }
    }
    System.out.println("Referències llegides "+numerito);
  }
  public void treuVins() throws SQLException{
    String sql = "delete  from vins";
    Statement st = null;
    try {
      st = conn.createStatement();
      st.executeUpdate(sql);
    } finally{
      if(st!= null) {
        st.close();
      }
    }
  }
  public void insertaVins() throws SQLException{
    for (Vi vinito: vins){
      if(vinito == null){
        continue;
      }
      if(vinito.idIndefinit()){
        determinaId();
        vinito.setId(numId);
      }
      String sql = String.format("insert into vins(id,nom,preu,estoc) values(%d,'%s',%d,%d);",vinito.getNom(),vinito.getPreu(),vinito.getEstoc());
      Statement st = null;
      try {
      st = conn.createStatement();
      st.executeUpdate(sql);
      guardades++;
    } finally {
      if (st!= null) {
        st.close();
      }
    }
  }
    System.out.println("Referències guardades "+ guardades);
  }

  public Vi elimina(String elimina) {
    for (int i = 0; i < vins.length; i++) {
      if (vins[i] != null) {
        /*normalitzem els noms dels vins*/
        String eliminaNormalitzat = Vi.normalitzaNom(elimina);
        String nomNormalitzat = Vi.normalitzaNom(vins[i].getNom());
        String nomEnMinuscules = nomNormalitzat.toLowerCase();
        /*passem a minuscules els noms dels vins*/
        String nomBuscatEnMinuscules = eliminaNormalitzat.toLowerCase();
        if(nomEnMinuscules.equals(nomBuscatEnMinuscules)) {
          Vi vinito = new Vi();
          vinito = vins[i];
          if (vinito.getEstoc() > 0) {
            return null;
          }
          vins[i] = null;
          return vinito;
        }
      }
    }
    return null;
  }
  public Vi cerca(String nom) {
    for (int i = 0; i < vins.length; i++) {
      if (vins[i] != null) {
        String nomNormalitzat = Vi.normalitzaNom(vins[i].getNom());
        String nomBuscadorNormalitzat = Vi.normalitzaNom(nom);
        if (nomNormalitzat.equals(nomBuscadorNormalitzat)) {
          return vins[i];
        }
        String nomEnMinuscules = vins[i].getNom().toLowerCase();
        String nomBuscatEnMinuscules = nom.toLowerCase();
        if(nomEnMinuscules.equals(nomBuscatEnMinuscules)) {
          return vins[i];
        }
      }
    }
    return null;
  }
  public int posicion;
  public void iniciaRecorregut() {
    posicion = 0;
  }
  public Vi getSeguent() {
    if (posicion < vins.length) {
      for(int i = posicion; i < vins.length; i++) {
        if(vins[i] == null) {
          posicion++;
          continue;
        }
        posicion++;
        return vins[i];
      }
    }
    return null;
  }
}
