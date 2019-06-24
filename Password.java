package ejercicios; 
import java.util.Scanner; 


public class Password {
  private String contraseña, cadena2;
  private char[] cadena;
  private static Scanner obDatos;
  
  
   public void esFuerte() {
	  obtenerContraseña();    
	  if(contraseña.length()>5 ) {
		System.out.println("Es segura");  
	  }else System.out.println("No lo es");
   }
   public String obtenerContraseña() {
	   System.out.println("Ingrese la contraseña:");
	   contraseña=obDatos.next();
	   return contraseña;
   }
   public  void minusculasDeMayusculas() {
	   obtenerContraseña(); 
	   cadena=contraseña.toCharArray();
	   for(int i=0;i<contraseña.length();i++) {
	  
	  System.out.println("El contenido es:"+ cadena[i]);
	 
	  if(cadena[i]=='a'|| cadena[i]=='f') {
		System.out.println("Es realmente segura");  
	  }
	   
	   }
   }
   
	public static void main(String[] args) {
		Password p=new Password (  );
		obDatos = new Scanner(System.in);
		p.esFuerte();
		p.minusculasDeMayusculas();
	}
}
