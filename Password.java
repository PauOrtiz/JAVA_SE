package ejercicios;
import java.util.Scanner; //https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-programacion-orientado-a-objetos-java/

public class Password {
  private int longitud;
  private String contraseña;
  private static Scanner obDatos, obDatos2;
  
   public Password(int l) {
	 this.longitud=l; 
   }
   
   public void setContraseña(String c) {
	   this.contraseña=c;
   }
   public String getContraseña() {
	   return contraseña; 
   }
   public void setLongitud(int l) {
	   this.longitud=l;
   }
   public int getLongitud() {
	   return longitud;
   }
   
   public boolean esFuerte(String c) {
	   boolean fuerte=false;
	   if(c>5) {//establecer bien la condición
		 fuerte=false;  
	   }
	    return fuerte;
   }
   
   public void generarPassword() {
	   
   }
	public static void main(String[] args) {
		int arreglo[]=;
		Password p=new Password();
		obDatos = new Scanner(System.in);
		obDatos2 = new Scanner(System.in);
	}
}
