import java.util.regex.*;
import java.util.Scanner;


class MasRegex {
//static String c="mi*";
  static String c1,c2;
//static String mi="michellemimimi";
private static Scanner obDatos,obDatos2;

public void Datos() {
	System.out.println("Ingresa la palabra a analizar");
	c1=obDatos.nextLine();
	System.out.println("Ingresa el patróna  buscar");
	c2=obDatos2.nextLine();	
}

	public static void main(String[] args) {
		MasRegex r=new MasRegex();
		obDatos= new Scanner(System.in);
		obDatos2= new Scanner(System.in);
		r.Datos();
		//Pattern p=Pattern.compile("mi*"); //defino el patrón
		Pattern p=Pattern.compile(c1); //entonces el atributo debe estar declarado como estático
		Matcher m=p.matcher(c2);
		while(m.find()) { //mientras encuentres el patrón
			System.out.println("Patrón encontrado");
		
		}
		
		
	}

}
