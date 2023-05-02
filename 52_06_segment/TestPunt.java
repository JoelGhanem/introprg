/*Aquest arxiu ens crea tests del Junit per l'arxiu del PPunt, comprova que tant x conm y siguin 0 com que punt tingui un constructor per defecte*/
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import jdk.jfr.Timestamp;
public class TestPunt {
		@Test
		public void constructor() {
				// comprova que Punt() pugui ser cridat
				new Punt();
		}
		@Test
		public void constructorDefecteXZero() {
				Punt p = new Punt();
				assertEquals(0,p.getX());
		}
		@Test
		public void constructorDefecteYZero() {
				Punt y = new Punt();
				assertEquals(0,y.getY());
		}
		@Test 
		public void setX42() {
				Punt p = new Punt();
				p.setX(42);
				assertEquals(42,p.getX());
		}
		@Test 
		public void setY42() {
				Punt p = new Punt();
				p.setY(42);
				assertEquals(42,p.getY());
		}
		@Test 
		public void constructorEspecific() {
				Punt p = new Punt(1,2);
				assertEquals(1,p.getX());
				assertEquals(2,p.getY());
		}
		@Test 
		public void suma() {
				Punt p1 = new Punt(2,3);
				Punt p2 = new Punt(3,4);
				Punt p = new Punt();
				p1.suma(p2);
				assertAll(
				() -> assertEquals(5,p1.getX()),
				() -> assertEquals(7,p1.getY())
				);
		}
}
