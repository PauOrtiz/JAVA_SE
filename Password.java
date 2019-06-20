package ejercicios;
import java.util.Scanner; 

public class Password {
  private int longitud;
  private String contraseña;
  private static Scanner obDatos, obDatos2;
  
   public Password(int l,String c) {
	 this.longitud=l; 
	 this.contraseña=c;
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
   public void esFuerte(String c, int l) {
	  obtenerContraseña();    
	  boolean fuerte=false;
	  if(contraseña.length()>5) {
		System.out.println("Es segura");  
	  }else System.out.println("No lo es");
   }
   public void obtenerContraseña() {
	   System.out.println("Ingrese la contraseña:");
	   contraseña=obDatos.nextLine();
   }
   public void obtenerLongitud() {
	   System.out.println("Ingresa la longitud:");
	   longitud=obDatos2.nextInt();
   }
   /*public boolean esFuerte(String c) {
	   boolean fuerte=false;
	   if(c>5) {//establecer bien la condición
		 fuerte=false;  
	   }
    return fuerte;
   }*/
   
   public void generarPassword(int l) {
	   //genera de forma aleatoria una contraseña
	   
   }
	public static void main(String[] args) {
		int passwords[]=; //crear el array de passwords y rellenarlo con los datos de getters
		Password p=new Password();
		obDatos = new Scanner(System.in);
		obDatos2 = new Scanner(System.in);
	}
}
