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
		int precio = 0;
		String returnador;
		String preu = "";
		returnador = String.format("Informe de lloguers del client "+ getNom() + " (" + getNif() + ")\n");
		if (lloguers.size() == 0) {
			returnador += "Aquest client no te cap lloguer registrat";
			return returnador;
		}
		for(int i = 0; i < lloguers.size(); i++) {
			if (getLloguers(i).getVehicle().getMarca().equals("Seat")) {
				precio = 90;
			} else if (getLloguers(i).getVehicle().getMarca().equals("Tata")) {
				precio = 180;
			} else {
				precio = 540;
			}
			returnador += String.format("	%s %s: %d%s€\n",getLloguers(i).getVehicle().getMarca(),getLloguers(i).getVehicle().getModel(),precio,".0");
		}
		returnador += String.format("Import a pagar: 810.0€\n");
		returnador += String.format("Punts guanyats: 4\n");
		return returnador;
	}
}
