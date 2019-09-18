
public class Paralelogramo { 
	public static int b,h,a;
	
	static {
		b=10;
		h=15;	
	}
	public static void area(int b, int h) {
		if(b>0 && h>0) {
			System.out.println("el área es"+b*h);
			
		}else{
			 System.out.println("java.lang.Exception: Breadth and height must be positive");
		 } 		
	}
	public static void main(String[] args) {
		
		Paralelogramo.area(b,h);
	}

}
