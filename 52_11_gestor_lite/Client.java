/*Aquest arxiu ens representa un client amb un nif, un nom, un telefon i un informe*/
import java.util.ArrayList;
public class Client {
    private String nif;
    private String nom;
    private String telefon;
    private ArrayList<Lloguer> lloguers;
    public Client(String nif, String nom, String telefon) {
        this.nif = nif;
        this.nom = nom;
        this.telefon = telefon;
        this.lloguers = new ArrayList<Lloguer>();
        Lloguer lloguer = new Lloguer(new Vehicle("Seat","600",1), 2);
        lloguers.add(lloguer);
    }
    public String getNif()     { return nif; }
    public String getNom()     { return nom; }
    public String getTelefon() { return telefon; }
    public Lloguer getLloguers(int posicio) { return lloguers.get(posicio); }
    public int getSize() { return lloguers.size();}
    public void setNif(String nif) { this.nif = nif; }
    public void setNom(String nom) { this.nom = nom; }
    public void setTelefon(String telefon) { this.telefon = telefon; }
    public String informe() {
        // XXX: de moment buit
        return null;
    }
}
