import  java.util.regex.*;
import java.util.Scanner;

public class ContraseñaRegex {
private static String c;
boolean password;
private String pattern;
private static Scanner obDatos;
//constructor
 public ContraseñaRegex(String contraseña){
	 ContraseñaRegex.c=contraseña;
 }
 
   public String Datos() {//capt la info
	   System.out.println("Ingrese su contraseña:");
	   c=obDatos.nextLine();
	   System.out.println("Capturado");
	  return c;  
   }
   public void Regex(String c) {
	   Datos();
	   //password=c;
	   pattern="(?=.*[0-9])(?=.*[a-z])(?=.*[@#$%^&+=])(.{4,6})";
	   password = c.matches(pattern);
	  //un dígito al menos una vez,también al menos una letra minúscula, también mayúscula,también un caracter especial, no espacios en blanco, al menos "n" caracteres mínimo,"n" máximo
	   if( password==true) {
		 System.out.println("Tu contraseña es segura"); 
	  }else {
		  System.out.println("Tu contraseña no es segura,intenta de nuevo");
	      System.out.println(c.matches(pattern));
	  }
   }
	public static void main(String[] args) {
		ContraseñaRegex password= new ContraseñaRegex("");//está esperando que le asigne un valor desde aquí, por eso dejo un espacillo en blcanco
        obDatos=new Scanner(System.in);
        password.Regex(c);
	}

}
