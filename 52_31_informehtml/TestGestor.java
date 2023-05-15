/*Els nous tests unitaris de la M05 UF2 on comprovarem que he fet el constructotr de clienDemo*/
import org.junit.Test;

import jdk.jfr.Timestamp;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
public class TestGestor {
		@Test
		public void ProvaDemo() {
				Client client = new Client("51590695Q","Eugènia Salinas Roig","93614214242");
				Vehicle vehicle1 = new Vehicle("Seat","600",2);
				Vehicle vehicle2 = new Vehicle("Tata","Vista",4);
				Vehicle vehicle3 = new Vehicle("Fiat","Uno",5);
				Lloguer lloguer1 = new Lloguer(vehicle1,2);
				Lloguer lloguer2 = new Lloguer(vehicle2,4);
				Lloguer lloguer3 = new Lloguer(vehicle3,5);
				client.setLloguers(lloguer1);
				client.setLloguers(lloguer2);
				client.setLloguers(lloguer3);
				ArrayList<Lloguer> lloguers = new ArrayList<>();
				lloguers.add(lloguer1);
				lloguers.add(lloguer2);
				lloguers.add(lloguer3);
				double total = 0;
				int bonificacions = 0;
				String resultat = "Informe de lloguers del client " + client.getNom() + " (" + client.getNif() + ")\n";
				for (Lloguer lloguer: lloguers) {
						double preu = lloguer.preu();
						// afegeix lloguers freqüents
						bonificacions ++;
						// afegeix bonificació per dos dies de lloguer de Luxe
						if (lloguer.getVehicle().getCategoria() == Vehicle.Categoria.LUXE && lloguer.getDies()>1 ) {
								bonificacions ++;
						}
						// composa els resultats d'aquest lloguer
						resultat += "\t" + lloguer.getVehicle().getMarca() + " " + lloguer.getVehicle().getModel() + ": " + (preu * 30) + "€" + "\n";
						total += preu * 30;
				}
				// afegeix informació final
				resultat += "Import a pagar: " + total + "€\n" + "Punts guanyats: " + bonificacions + "\n";
				assertEquals(resultat, client.informe());
		}
		@Test
		public void senseLloguers() {
				Client client = new Client("49297007A", "Joel","677442280");
				String resultatEsperat = String.format("Informe de lloguers del client "+ client.getNom() + " (" + client.getNif() + ")\n");
				resultatEsperat+="Aquest client no te cap lloguer registrat";
				assertEquals(resultatEsperat, client.informe());

		}
		@Test 
		public void provaSetNif() {
				Client client = new Client("51590695Q","Eugènia Salinas Roig","93614214242");
				client.setNif("51590695Q");
				assertEquals("51590695Q",client.getNif());
		}
		@Test 
		public void provaSetNom() {
				Client client = new Client("51590695Q","Eugènia Salinas Roig","93614214242");
				client.setNom("Eugènia Salinas Roig");
				assertEquals("Eugènia Salinas Roig",client.getNom());
		}
		@Test 
		public void provaSetTlf() {
				Client client = new Client("51590695Q","Eugènia Salinas Roig","93614214242"); 
				client.setTelefon("93614214242");
				assertEquals("93614214242",client.getTelefon());
		}
		@Test 
		public void provaSizeLloguers() {
				Client client = new Client("51590695Q","Eugènia Salinas Roig","93614214242");
				assertEquals(0,client.getSize());
		}
		@Test 
		public void provaAddLloguers() {
				Client client = new Client("51590695Q","Eugènia Salinas Roig","93614214242");
				Vehicle vehicle1 = new Vehicle("Seat","600",2);
				Lloguer lloguer1 = new Lloguer(vehicle1,2);
				client.setLloguers(lloguer1);
				assertEquals(1,client.getSize());
		}
		@Test 
		public void getLloguers() {
				Client client = new Client("49297007A", "Joel","677442280");
				Vehicle vehicle1 = new Vehicle("Seat","600",2);
				Lloguer lloguer1 = new Lloguer(vehicle1,2);
				client.setLloguers(lloguer1);
				assertEquals(lloguer1, client.getLloguers(0));
		}
		@Test 
		public void provaNomBuit() {
				Client client = new Client("51590695Q","","93614214242"); 
				assertEquals("",client.getNom());
		}
		@Test 
		public void provaNifBuit() {
				Client client = new Client("","Eugènia Salinas Roig","93614214242"); 
				assertEquals("",client.getNif());
		}
		@Test 
		public void provaTlfbuit() {
				Client client = new Client("51590695Q","Eugènia Salinas Roig","");
				assertEquals("",client.getTelefon());
		}
		@Test
		public void Provao1() {
				Client client = new Client("51590695Q","Eugènia Salinas Roig","93614214242");
				Vehicle vehicle1 = new Vehicle("Seat","600",2);
				Vehicle vehicle2 = new Vehicle("Tata","Vista",4);
				Vehicle vehicle3 = new Vehicle("Fiat","Uno",5);
				Lloguer lloguer1 = new Lloguer(vehicle1,2);
				Lloguer lloguer2 = new Lloguer(vehicle2,4);
				Lloguer lloguer3 = new Lloguer(vehicle3,5);
				client.setLloguers(lloguer1);
				client.setLloguers(lloguer2);
				client.setLloguers(lloguer3);
					ArrayList<Lloguer> lloguers = new ArrayList<>();
				lloguers.add(lloguer1);
				lloguers.add(lloguer2);
				lloguers.add(lloguer3);
				double total = 0;
				int bonificacions = 0;
				String resultat = "Informe de lloguers del client " + client.getNom() + " (" + client.getNif() + ")\n";
				for (Lloguer lloguer: lloguers) {
						double preu = lloguer.preu();
						// afegeix lloguers freqüents
						bonificacions ++;
						// afegeix bonificació per dos dies de lloguer de Luxe
						if (lloguer.getVehicle().getCategoria() == Vehicle.Categoria.LUXE && lloguer.getDies()>1 ) {
								bonificacions ++;
						}
						// composa els resultats d'aquest lloguer
						resultat += "\t" + lloguer.getVehicle().getMarca() + " " + lloguer.getVehicle().getModel() + ": " + (preu * 30) + "€" + "\n";
						total += preu * 30;
				}
				// afegeix informació final
				resultat += "Import a pagar: " + total + "€\n" + "Punts guanyats: " + bonificacions + "\n";
				assertEquals(resultat, client.informe());
		}
		@Test
		public void ProvaDemo2() {
				Client client = new Client("51590695Q","Eugènia Salinas Roig","93614214242");
				Vehicle vehicle1 = new Vehicle("Seat","600",2);
				Vehicle vehicle2 = new Vehicle("Tata","Vista",4);
				Vehicle vehicle3 = new Vehicle("Fiat","Uno",5);
				Lloguer lloguer1 = new Lloguer(vehicle1,2);
				Lloguer lloguer2 = new Lloguer(vehicle2,4);
				Lloguer lloguer3 = new Lloguer(vehicle3,5);
				client.setLloguers(lloguer1);
				client.setLloguers(lloguer2);
				client.setLloguers(lloguer3);
				ArrayList<Lloguer> lloguers = new ArrayList<>();
				lloguers.add(lloguer1);
				lloguers.add(lloguer2);
				lloguers.add(lloguer3);
				double total = 0;
				int bonificacions = 0;
				String resultat = "Informe de lloguers del client " + client.getNom() + " (" + client.getNif() + ")\n";
				for (Lloguer lloguer: lloguers) {
						double preu = lloguer.preu();
						// afegeix lloguers freqüents
						bonificacions ++;
						// afegeix bonificació per dos dies de lloguer de Luxe
						if (lloguer.getVehicle().getCategoria() == Vehicle.Categoria.LUXE && lloguer.getDies()>1 ) {
								bonificacions ++;
						}
						// composa els resultats d'aquest lloguer
						resultat += "\t" + lloguer.getVehicle().getMarca() + " " + lloguer.getVehicle().getModel() + ": " + (preu * 30) + "€" + "\n";
						total += preu * 30;
				}
				// afegeix informació final
				resultat += "Import a pagar: " + total + "€\n" + "Punts guanyats: " + bonificacions + "\n";
				assertEquals(resultat, client.informe());
		}
		@Test
		public void ProvaDemo3() {
				Client client = new Client("51590695Q","Eugènia Salinas Roig","93614214242");
				Vehicle vehicle1 = new Vehicle("Seat","600",2);
				Vehicle vehicle2 = new Vehicle("Tata","Vista",4);
				Vehicle vehicle3 = new Vehicle("Fiat","Uno",5);
				Lloguer lloguer1 = new Lloguer(vehicle1,2);
				Lloguer lloguer2 = new Lloguer(vehicle2,4);
				Lloguer lloguer3 = new Lloguer(vehicle3,5);
				client.setLloguers(lloguer1);
				client.setLloguers(lloguer2);
				client.setLloguers(lloguer3);
				ArrayList<Lloguer> lloguers = new ArrayList<>();
				lloguers.add(lloguer1);
				lloguers.add(lloguer2);
				lloguers.add(lloguer3);
				double total = 0;
				int bonificacions = 0;
				String resultat = "Informe de lloguers del client " + client.getNom() + " (" + client.getNif() + ")\n";
				for (Lloguer lloguer: lloguers) {
						double preu = lloguer.preu();
						// afegeix lloguers freqüents
						bonificacions ++;
						// afegeix bonificació per dos dies de lloguer de Luxe
						if (lloguer.getVehicle().getCategoria() == Vehicle.Categoria.LUXE && lloguer.getDies()>1 ) {
								bonificacions ++;
						}
						// composa els resultats d'aquest lloguer
						resultat += "\t" + lloguer.getVehicle().getMarca() + " " + lloguer.getVehicle().getModel() + ": " + (preu * 30) + "€" + "\n";
						total += preu * 30;
				}
				// afegeix informació final
				resultat += "Import a pagar: " + total + "€\n" + "Punts guanyats: " + bonificacions + "\n";
				assertEquals(resultat, client.informe());
		}
		@Test
		public void ProvaDemo4() {
				Client client = new Client("51590695Q","Eugènia Salinas Roig","93614214242");
				Vehicle vehicle1 = new Vehicle("Seat","600",2);
				Vehicle vehicle2 = new Vehicle("Tata","Vista",4);
				Vehicle vehicle3 = new Vehicle("Fiat","Uno",5);
				Lloguer lloguer1 = new Lloguer(vehicle1,2);
				Lloguer lloguer2 = new Lloguer(vehicle2,4);
				Lloguer lloguer3 = new Lloguer(vehicle3,5);
				client.setLloguers(lloguer1);
				client.setLloguers(lloguer2);
				client.setLloguers(lloguer3);
				ArrayList<Lloguer> lloguers = new ArrayList<>();
				lloguers.add(lloguer1);
				lloguers.add(lloguer2);
				lloguers.add(lloguer3);
				double total = 0;
				int bonificacions = 0;
				String resultat = "Informe de lloguers del client " + client.getNom() + " (" + client.getNif() + ")\n";
				for (Lloguer lloguer: lloguers) {
						double preu = lloguer.preu();
						// afegeix lloguers freqüents
						bonificacions ++;
						// afegeix bonificació per dos dies de lloguer de Luxe
						if (lloguer.getVehicle().getCategoria() == Vehicle.Categoria.LUXE && lloguer.getDies()>1 ) {
								bonificacions ++;
						}
						// composa els resultats d'aquest lloguer
						resultat += "\t" + lloguer.getVehicle().getMarca() + " " + lloguer.getVehicle().getModel() + ": " + (preu * 30) + "€" + "\n";
						total += preu * 30;
				}
				// afegeix informació final
				resultat += "Import a pagar: " + total + "€\n" + "Punts guanyats: " + bonificacions + "\n";
				assertEquals(resultat, client.informe());
		}
		@Test
		public void ProvaDemo5() {
				Client client = new Client("51590695Q","Eugènia Salinas Roig","93614214242");
				Vehicle vehicle1 = new Vehicle("Seat","600",2);
				Vehicle vehicle2 = new Vehicle("Tata","Vista",4);
				Vehicle vehicle3 = new Vehicle("Fiat","Uno",5);
				Lloguer lloguer1 = new Lloguer(vehicle1,2);
				Lloguer lloguer2 = new Lloguer(vehicle2,4);
				Lloguer lloguer3 = new Lloguer(vehicle3,5);
				client.setLloguers(lloguer1);
				client.setLloguers(lloguer2);
				client.setLloguers(lloguer3);
					ArrayList<Lloguer> lloguers = new ArrayList<>();
				lloguers.add(lloguer1);
				lloguers.add(lloguer2);
				lloguers.add(lloguer3);
				double total = 0;
				int bonificacions = 0;
				String resultat = "Informe de lloguers del client " + client.getNom() + " (" + client.getNif() + ")\n";
				for (Lloguer lloguer: lloguers) {
						double preu = lloguer.preu();
						// afegeix lloguers freqüents
						bonificacions ++;
						// afegeix bonificació per dos dies de lloguer de Luxe
						if (lloguer.getVehicle().getCategoria() == Vehicle.Categoria.LUXE && lloguer.getDies()>1 ) {
								bonificacions ++;
						}
						// composa els resultats d'aquest lloguer
						resultat += "\t" + lloguer.getVehicle().getMarca() + " " + lloguer.getVehicle().getModel() + ": " + (preu * 30) + "€" + "\n";
						total += preu * 30;
				}
				// afegeix informació final
				resultat += "Import a pagar: " + total + "€\n" + "Punts guanyats: " + bonificacions + "\n";
				assertEquals(resultat, client.informe());
		}
}
