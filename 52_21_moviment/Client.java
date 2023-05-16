/*Aquest arxiu ens representa un client amb un nif, un nom, un telefon i un informe*/
import java.util.ArrayList;

public class Client {
	private String nif;
	private String nom;
	private String telefon;
	ArrayList<Lloguer> lloguers = new ArrayList<Lloguer>();
	public Client(String nif, String nom, String telefon) {
		this.nif = nif;
		this.nom = nom;
		this.telefon = telefon;
		this.lloguers = new ArrayList<Lloguer>();
	}
	public String getNif()     { return nif; }
	public String getNom()     { return nom; }
	public String getTelefon() { return telefon; }
	public Lloguer getLloguers(int posicio) { return lloguers.get(posicio); }
	public int getSize() { return lloguers.size();}
	public void setLloguers(Lloguer lloguer) { this.lloguers.add(lloguer);}
	public void setNif(String nif) { this.nif = nif; }
	public void setNom(String nom) { this.nom = nom; }
	public void setTelefon(String telefon) { this.telefon = telefon; }
	public String informe() {
		double total = 0;
		int bonificacions = 0;
		String resultat = "Informe de lloguers del client " + getNom() + " (" + getNif() + ")\n";
		if(lloguers.size() == 0) {
			resultat += "Aquest client no te cap lloguer registrat";
			return resultat;
		}
		for (Lloguer lloguer: lloguers) {
			// afegeix lloguers freqüents
			bonificacions += lloguer.bonificacionsDeLloguer();
			// afegeix bonificació per dos dies de lloguer de Luxe
			// composa els resultats d'aquest lloguer
			resultat += "\t" + lloguer.getVehicle().getMarca() + " " + lloguer.getVehicle().getModel() + ": " + (lloguer.quantitat() * 30) + "€" + "\n";
			total += lloguer.quantitat() * 30;
		}
		// afegeix informació final
		resultat += "Import a pagar: " + total + "€\n" + "Punts guanyats: " + bonificacions + "\n";
		return resultat;
	}

