/*Els nous tests unitaris de la M05 UF2 on comprovarem que he fet el constructotr de clienDemo*/
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
public class TestGestor {
		private ArrayList<Lloguer> lloguers;
		@Test
		public void ProvaDemo() {
		Client client = new Client("51590695Q","Eugènia Salinas Roig","93614214242");
		Vehicle vehicle1 = new Vehicle("Tata","Aventador",1);
		Vehicle vehicle2 = new Vehicle("Seat","Fiesta",3);
		 this.lloguers = new ArrayList<Lloguer>();
		Lloguer lloguer1 = new Lloguer(vehicle1,2);
		Lloguer lloguer2 = new Lloguer(vehicle2,4);
		lloguers.add(lloguer1);
		lloguers.add(lloguer2);
		String resultatEsperat = "Informe de lloguers del client Eugènia Salinas Roig (51590695Q)\n "+
				"	Seat 600: 90€\n" +
				"	Tata Vista: 180.0€\n" +
				"	Fiat Uno: 540.0€\n" +
				"Import a pagar 810.0€\n" +
				"Punts Guanyats: 4\n";
		assertEquals(resultatEsperat, client.informe());
		}
}
