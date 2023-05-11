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
		resultatEsperat = String.format("Informe de lloguers del client "+ getNom() + " (" + getNif() + ")\n");
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
		resultatEsperat += String.format("Import a pagar: 810.0€\n");
		resultatEsperat += String.format("Punts guanyats: 4\n");
	}
}
