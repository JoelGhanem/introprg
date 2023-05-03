/*Aquest arxiu fa tests de la classe Segment*/
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import jdk.jfr.Timestamp;

public class TestSegment {
		@Test
		public void TestSegmentDefault(){
				Segment s = new Segment();
				assertAll(
								() -> assertEquals(new Punt(), s.getP1()),
								() -> assertEquals(new Punt(), s.getP2())
						 );
		}
		@Test 
		public void TestEspecific() {
				Punt p1 = new Punt(1,2);
				Punt p2 = new Punt(3,4);
				Segment s = new Segment(p1,p2);
				assertAll(
								() -> assertEquals(p1, s.getP1()),
								() -> assertEquals(p2, s.getP2())
						 );

		}
		@Test
		public void TestLongitud() {
				Segment s = new Segment(new Punt(0,0), new Punt(0,0));
				assertEquals(0, s.longitud());
		}

}
