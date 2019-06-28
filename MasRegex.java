import java.util.regex.*;
import java.util.Scanner;

class MasRegex {
static String c="mi*";
static String mi="michellemimimi";
private static Scanner obDatos;

//aquí el método que recoje la info

	public static void main(String[] args) {
		//Pattern p=Pattern.compile("mi*"); //defino el patrón
		Pattern p=Pattern.compile(c); //entonces el atributo debe estar declarado como estático
		Matcher m=p.matcher(mi);
		obDatos= new Scanner(System.in);//en esta cadena busca el patrón
		while(m.find()) { //mientras encuentres el patrón
			System.out.println("Patrón encontrado");
		
		}
		
		
	}

}