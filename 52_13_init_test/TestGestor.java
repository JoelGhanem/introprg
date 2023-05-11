/*Els nous tests unitaris de la M05 UF2 on comprovarem que he fet el constructotr de clienDemo*/
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
public class TestGestor {
	private ArrayList<Lloguer> lloguers;
	@Test
	public void ProvaDemo() {
		Client client = new Client("51590695Q","Eugènia Salinas Roig","93614214242");
		Vehicle vehicle1 = new Vehicle("Seat","600",2);
		Vehicle vehicle2 = new Vehicle("Tata","Vista",4);
		Vehicle vehicle3 = new Vehicle("Fiat","Uno",5);
		this.lloguers = new ArrayList<Lloguer>();
		Lloguer lloguer1 = new Lloguer(vehicle1,2);
		Lloguer lloguer2 = new Lloguer(vehicle2,4);
		Lloguer lloguer3 = new Lloguer(vehicle3,5);
		lloguers.add(lloguer1);
		lloguers.add(lloguer2);
		lloguers.add(lloguer3);
		String resultatEsperat;
		int suma = 0;
		int precio = 0;
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
		resultatEsperat += String.format("Import a pagar: "+suma+".0€\n");
		resultatEsperat += String.format("Punts guanyats: 4\n");
		assertEquals(resultatEsperat, client.informe());
	}
}
