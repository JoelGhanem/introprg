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
}
