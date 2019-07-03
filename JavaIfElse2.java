import java.util.Scanner;

public class JavaIfElse {
	private static int n1;
	private static Scanner obD;
   public int obDatos() {
	   System.out.println("Ingresa el número");
	   n1=obD.nextInt();
	   return n1;
   }
   public void sentenciaIf( int n1) {
	   if(n1%2!=0 || n1==6 || n1<=20) {
		   System.out.println("Weird");
	   }else {
		   System.out.println("Not Weird");
	   }
   }
	public static void main(String[] args) {
		JavaIfElse p= new JavaIfElse();
		obD= new Scanner(System.in);
		p.obDatos();
		p.sentenciaIf(n1);

	}