import  java.util.regex.*;
import java.util.Scanner;

public class ContraseñaRegex {
private String c;
private static Scanner obDatos;

 public ContraseñaRegex(String contraseña){
	 this.c=contraseña;
 }
 
   public String Datos() {
	   System.out.println("Ingrese su contraseña:");
	   c=obDatos.nextLine();
	   System.out.println("Capturado");
	  return c;  
   }
	public static void main(String[] args) {
		ContraseñaRegex password= new ContraseñaRegex("");//está esperando que le asigne un valor desde aquí, por eso dejo un espacillo en blcanco
        obDatos=new Scanner(System.in);
        password.Datos();
	}

}