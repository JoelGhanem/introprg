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
				ArrayList<Lloguer> lloguers = new ArrayList<Lloguer>();
				Lloguer lloguer1 = new Lloguer(vehicle1,2);
				Lloguer lloguer2 = new Lloguer(vehicle2,4);
				Lloguer lloguer3 = new Lloguer(vehicle3,5);
				lloguers.add(lloguer1);
				lloguers.add(lloguer2);
				lloguers.add(lloguer3);
				String resultatEsperat;
				int precio = 0;
				int suma = 0;
				resultatEsperat = String.format("Informe de lloguers del client "+ client.getNom() + " (" + client.getNif() + ")\n");
				for(int i = 0; i < lloguers.size(); i++) {
						if (client.getLloguers(i).getVehicle().getMarca().equals("Seat")) {
								precio = 90;
								suma += precio;
						} else if (client.getLloguers(i).getVehicle().getMarca().equals("Tata")) {
								precio = 180;
								suma += precio;
						} else {
								precio = 540;
								suma += precio;
						}
						resultatEsperat += String.format("	%s %s: %d%s€\n",client.getLloguers(i).getVehicle().getMarca(),client.getLloguers(i).getVehicle().getModel(),precio,".0");
				}
				resultatEsperat += String.format("Import a pagar: "+ suma+".0€\n");
				resultatEsperat += String.format("Punts guanyats: 4\n");
				assertEquals(resultatEsperat, client.informe());
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

}
