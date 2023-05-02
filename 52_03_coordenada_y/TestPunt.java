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
}
