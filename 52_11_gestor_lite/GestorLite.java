/*Aqyuest arxiu em permetra fer proves basiques del meu codi*/
public class GestorLite {
	public static void main(String[] args) {
		Client demo = creaClientDemo();
		mostraClient(demo);
	}
		public static Client creaClientDemo() {
			Client client = new Client("51590695Q", "Eugènia Salinas Roig", "93614214242");
			return client;
		}
		public static void mostraClient(Client client) {
			System.out.printf("Client: %s%n        %s%n        %s%nLloguers: %s%n", client.getNom(),client.getNif(),client.getTelefon(),client.getSize());
			for (int i = 0; i < client.getSize(); i++) {
				 System.out.printf("%d. vehicle: %s%s%n        dies llogats: %d%n", i+1,client.getLloguers(i).getVehicle().getMarca(),client.getLloguers(i).getVehicle().getModel(),client.getLloguers(i).getDies());
			}
		}
}
