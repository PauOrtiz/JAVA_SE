
public class Paralelogramo { 
	public static int b=0,h=0;
	public static boolean flag=false;
	
	static {
		Scanner s=new Scanner(System.in);
		b= s.nextInt();
		h=s.nextInt();
		if(b>0 && h>0) {
			flag=true;
				
		}else{
			 System.out.println("java.lang.Exception: Breadth and height must be positive");
		 } 
	}
	
	public static void main(String[] args) {
		
		if(flag) {
			int a=b*h;
			System.out.println(a);
		}
	}

}
