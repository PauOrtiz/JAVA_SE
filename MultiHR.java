import java.util.Scanner;

public class MultiHR {
 private int N;
 private  static Scanner s;
 
 private int obd() {
	 s = new Scanner(System.in);
     N = s.nextInt();
     s.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); 
     return N;
 }
 private void imprimir() {
	 for( int i=0;i<=20;i++){
         System.out.println(N+ "X"+i+"="+N*i); 
    }
 }
	public static void main(String[] args) {
		MultiHR r= new MultiHR();
		r.obd();
		r.imprimir();
	
	}
}