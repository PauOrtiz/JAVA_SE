package cadenasArreglos;
import java.util.Scanner;

public class Cadenas {
   private static String mensaje;
  private int vocales=0;
   private static Scanner obScanner;
   public void obtenMensaje() { //obten mensaje
	 System.out.println("Dime tu mensaje"); 
	 mensaje=obScanner.next();
	
   }
   public void cuenta(String mensaje) {
	   
	   for (int i = 0; i < mensaje.length(); i++) {
           char mensajes = mensaje.charAt(i); //obtenemos el caracter en la posicion i
           //si el caracter es igual a "a", "e", "i", "o", ó "u" entonces es vocal
           if (mensajes == 'a' || mensajes == 'e' || mensajes ==  'i' || mensajes == 'o' || mensajes == 'u') {
             vocales=  vocales++; //contamos cantidad vocales +1            
           }         
	   }
	   System.out.println("El número de vocales es: " + vocales);
   }
   //cuenta las vocales de la cadena
	public static void main(String[] args) {
		Cadenas cadenita=new Cadenas();
		obScanner=new Scanner(System.in);
		cadenita.obtenMensaje();
		 cadenita.cuenta(mensaje);
	}
}