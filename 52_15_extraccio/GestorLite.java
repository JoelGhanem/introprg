/*Aqyuest arxiu em permetra fer proves basiques del meu codi*/
public class GestorLite {
		public static void main(String[] args) {
				Client demo = creaClientDemo();
				mostraClient(demo);
		}
		public static Client creaClientDemo() {
				Client client = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
				Vehicle vehicle1 = new Vehicle("Seat","600",1);
				Vehicle vehicle2 = new Vehicle("Tata","Vista",1);
				Vehicle vehicle3 = new Vehicle("Fiat","Uno",5);
				Lloguer lloguer1 = new Lloguer(vehicle1,2);
				Lloguer lloguer2 = new Lloguer(vehicle2,5);
				Lloguer lloguer3 = new Lloguer(vehicle3,3);
				client.setLloguers(lloguer1);
				client.setLloguers(lloguer2);
				client.setLloguers(lloguer3);
				return client;
		}
		public static void mostraClient(Client client) {
				System.out.printf("Client: %s%n        %s%n        %s%nLloguers: %s%n", client.getNom(),client.getNif(),client.getTelefon(),client.getSize());
				for (int i = 0; i < client.getSize(); i++) {
						System.out.printf("        %d. vehicle: %s %s%n           dies llogats: %d%n", i+1,client.getLloguers(i).getVehicle().getMarca(),client.getLloguers(i).getVehicle().getModel(),client.getLloguers(i).getDies());
				}
		}
}
