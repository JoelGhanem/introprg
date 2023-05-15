
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

				if(lloguers.size() == 0) {
						return composaCapsalera() + "Aquest client no te cap lloguer registrat";
				}

				return composaCapsalera() + composaDetall() + composaPeu();
		}	
		public String composaCapsalera() {
				return "Informe de lloguers del client " + getNom() + " (" + getNif() + ")\n";
		}
		public String composaDetall() {
				String resultat = "";
				for(Lloguer lloguer:lloguers) {
						resultat += "\t" + lloguer.getVehicle().getMarca() + " " + lloguer.getVehicle().getModel() + ": " + (lloguer.quantitat() * 30) + "€" + "\n";
				}
				return resultat;
		}
		public String composaPeu() {
				return "Import a pagar: " + importTotal() + "€\n" + "Punts guanyats: " + bonificacionsTotal() + "\n";
		}
		public Double importTotal() += {
				double total = 0;
				for (Lloguer lloguer : lloguers) {
						total += lloguer.quantitat() * 30;
				}
				return total;
		}
		public int bonificacionsTotal() {
				int bonificacions = 0;
				for(Lloguer lloguer:lloguers) {
						bonificacions+=lloguer.bonificacionsDeLloguer(lloguer);
				}
				return bonificacions;
		}
}

