package ejercicios; 
import java.util.Scanner; 

public class Password {
  private String contraseña;
  private char cadena;
  private static Scanner obDatos;
  
  
   public void esFuerte() {
	  obtenerContraseña();    
	  if(contraseña.length()>5 ) {
		System.out.println("Es segura");  
	  }else System.out.println("No lo es");
   }
   public String obtenerContraseña() {
	   System.out.println("Ingrese la contraseña:");
	   contraseña=obDatos.nextLine();
	   return contraseña;
   }
   public  void minusculasDeMayusculas() {
	   obtenerContraseña(); 
	   for(int i=0;i<contraseña.length();i++) {
	   cadena=contraseña.charAt(i);
	   System.out.println("El contenido es:"+ cadena);
	    }
   }
   
	public static void main(String[] args) {
		Password p=new Password (  );
		obDatos = new Scanner(System.in);
		p.esFuerte();
		p.minusculasDeMayusculas();
	}
}