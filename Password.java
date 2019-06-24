package ejercicios; 
import java.util.Scanner; 

public class Password {
  private String contraseña;
  private static Scanner obDatos;
  
   public void esFuerte() {
	  obtenerContraseña();    
	  if(contraseña.length()>5) {
		System.out.println("Es segura");  
	  }else System.out.println("No lo es");
   }
   public String obtenerContraseña() {
	   System.out.println("Ingrese la contraseña:");
	   contraseña=obDatos.nextLine();
	   return contraseña;
   }
   
	public static void main(String[] args) {
		Password p=new Password (  );
		obDatos = new Scanner(System.in);
		p.esFuerte();	
	}
}