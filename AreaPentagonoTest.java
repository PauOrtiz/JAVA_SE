
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;//para que acepte parameters

import java.util.Arrays;


@RunWith(value=Parameterized.class)
public class AreaPentagonoTest {
	@Parameters
	public static Iterable<Object[]>getData(){
		return Arrays.asList(new Object[][]{
			{3,1,1.5},{2,3,3},{3,3,4.5}
		});
	}
  private double a, b, esp;
  public AreaPentagonoTest(double a, double b, double esp) {
	  this.a=a;
	  this.b=b;
	  this.esp=esp;
  }
	@Test
	public void testAreaPoligono(double a, double b, double esp) {
		AreaPentagono ap=new AreaPentagono(); 
		double r= ap.areaPoligono(a, b);
		System.out.println("AreaPoligono()");
		assertEquals(esp, r);
	}
}
