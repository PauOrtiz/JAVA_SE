import java.util.Scanner;

public class Hr1 {
	private static int n1;
	private static Scanner ObScanner;
	
	public void obDatos() {
		System.out.println("Ingresa n1");
		n1= ObScanner.nextInt();	
	}
    public void decision() {
    	if(n1==0 || n1>5 && n1==20) {
    		System.out.println("Weird");
    	}else if(n1!=0 || n1==2 || n1==6 || n1>6 && n1>20) {
    		System.out.println("Not Weird");
    	}
    }
	public static void main(String[] args) {
		Hr1 r=new Hr1( );
		ObScanner=new Scanner(System.in);
		r.obDatos();
		r.decision();
	}
}
