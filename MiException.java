package excepctionJava; 
import java.util.Scanner;

public class MiExcepcion extends arreglos {
 private String cadena="Manejo de excepciones en Java";
 private static Scanner obScanner;
 private int indice;
 private char[] arr= cadena.toCharArray();
 
 //@override
 public void recorrerArreglo(){ //redefinición del método
 	System.out.println("Introduce el índice desde el que quieres recorrer el arreglo");
    indice=obScanner.nextInt();
    if (indice>0 || indice>-1)
    {
   
 	for(int i=indice; i<arr.length;i++) {
 	System.out.println(arr[i]);
      }
    }//fin if
 	try { //el bloque conflictivo
 	System.out.println("El contenido de arr[-10] es:"+ arr[-10]); //no existen índices negativos por lo que se produce una excepción del tipo java.lang.ArrayIndexOutOfBoundsException
 	  } //cierre
 	catch(ArrayIndexOutOfBoundsException excepcion)
 	
 	{
 		 System.out.println(" Imposible acceder");
 	}finally {
 		System.out.println("Bloque try...catch finalizado");
 	}
 }
  	public static void main(String[] args) {
		MiExcepcion nuevoArreglo=new MiExcepcion();
		obScanner=new Scanner(System.in);
		nuevoArreglo.recorrerArreglo();
	}
 }