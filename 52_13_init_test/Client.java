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
				Lloguer lloguer1 = new Lloguer(new Vehicle("Tata","Vista",1), 5);
				lloguers.add(lloguer1);
				Lloguer lloguer2 = new Lloguer(new Vehicle("Fiat","Uno",1), 3);
				lloguers.add(lloguer2);
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
				double precio = 0;
				System.out.println("Informe de lloguers del client "+ getNom() + " (" + getNif() + ")");
				for(int i = 0; i < lloguers.size(); i++) {
						if (getLloguers(i).getVehicle().getMarca().equals("Seat")) {
								precio = 90.0;
						} else if (getLloguers(i).getVehicle().getMarca().equals("Tata")) {
								precio = 180.0;
						} else {
								precio = 540.0;
						}
						System.out.printf("	%s %s: %f€%n",getLloguers(i).getVehicle().getMarca(),getLloguers(i).getVehicle().getModel(),precio);
				}
				return "";
		}
}
