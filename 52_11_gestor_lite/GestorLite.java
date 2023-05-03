/*Aqyuest arxiu em permetra fer proves basiques del meu codi*/
public class GestorLite {
		public int contador = 1;
public static void main(String[] args) {
    Client demo = creaClientDemo();
    mostraClient(demo);
}
public static Client creaClientDemo() {
		Client client = new Client("49297007A", "Joel", "677442280");
		return client;
		}
		public static void mostraClient(Client client) {
				System.out.printf("Client: %s%n %s%n %f%n Lloguers: %f%n  %f. vehicle", client.getNom(),client.getNif(),client.getTelefon());
		}

}
