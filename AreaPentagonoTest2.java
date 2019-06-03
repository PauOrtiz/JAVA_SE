import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AreaPentagonoTest2   {
	private AreaPentagono ap=new AreaPentagono(); 
  	@Test
  	public void testAreaPoligono2() {
		double r= ap.areaPoligono(3.1, 2.4);
  		double esperado=3.7199999999999998;
  		assertEquals(esperado, r);
  	}
}

}
