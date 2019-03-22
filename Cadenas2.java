package cadenasArreglos;
import java.util.Scanner;

public class Cadenas2 {
	private static int opcion,l;
	private String str, mensaje;
	private static Scanner obScanner;
	
	public void obtenerLongitud() {
		System.out.println("Introduce la cadena de la que quieres saber la longitud:");
		mensaje=obScanner.next(); //con nextln no funcionaba
		l=mensaje.length();
		System.out.println("La longitud de es:" + l);
	}
	public void aMayusculas() {
		System.out.println("Introduce la cadena que quieres convertir a mayúsculas");
		mensaje=obScanner.next(); 
		str=mensaje.toUpperCase();
		System.out.println("La cadena queda como:\n" + str);
	}
	public void aMinusculas() {
		System.out.println("Introduce la cadena que quieres convertir a minúsculas");
		mensaje=obScanner.next(); 
		str=mensaje.toLowerCase();
		System.out.println("La cadena queda como:\n" + str);	
	}
	public void devuelveCaracter() { //listar el contenido de la cadena en cierta posición
		System.out.println("Introduce la cadena");
		mensaje=obScanner.next(); 
		for(int i=0;i<mensaje.length();i++) {
		System.out.println("El caracter que se encuentra en la posición"+"("+ i+")" +" es:" + mensaje.charAt(i));
		 }
	}
	
	public void metodosCadenas() {
	  switch(opcion) {
	  case 1:
		   obtenerLongitud();
	  break;
	  case 2:
		  aMayusculas();
	  break;
	  case 3:
		  aMinusculas();
	  break;
	  case 4:
		  devuelveCaracter();
	  break;
	  case 5:System.exit(0);
	  break;
	  default: System.out.println("Colección de métodos para cadenas");
	  }
	}

	public static void main(String[] args) {
		Cadenas2 cadena= new Cadenas2();
		System.out.println("Elige alguna de las siguientes opciones");
		System.out.println("1:Obtener la longitud de una cadena");
		System.out.println("2:Cambiar una cadena a mayúsculas");
		System.out.println("3:Cambiar una cadena a minúsculas");
		System.out.println("4:Obtener el caracter que se encuentra en cierta posición de la cadena");
		System.out.println("5:Salir");
		obScanner= new Scanner(System.in);
		opcion=obScanner.nextInt();
		cadena.metodosCadenas(); //este llama al resto de los métodos		
	}
}
