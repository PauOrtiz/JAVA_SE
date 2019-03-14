package sentencias; //clase que determina si el número introducido por el usuario es par o impar

import java.util.Scanner;

public class SentenciaIf {
 private int s;
 private static Scanner obScanner;
     public void obtenerNumero() {
	  System.out.println("Ingresa un número entero para saber si es par o impar:\n");
	  s=obScanner.nextInt();
  }
     public void comprobacion() {
	  if((s%2)==0) {
		  System.out.println("El número es par");
	  }
	  else {
		     System.out.println("El número es impar");}
	  }
     public static void main(String[] args) {
		SentenciaIf Numero= new SentenciaIf();
        obScanner=new Scanner(System.in);
        Numero.obtenerNumero();
        Numero.comprobacion();    
	}
}