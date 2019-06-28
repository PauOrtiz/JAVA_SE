port java.util.regex.*;
import java.util.Scanner;

class MasRegex {
  static String c1,c2;
private static Scanner obDatos,obDatos2;
private static Matcher m;
private static Pattern p;

public String DatosAnalizar() {
	System.out.println("Ingresa la palabra a analizar");
	c1=obDatos.next();
	return c1;
}
public String DatosPatron(){
System.out.println("Ingresa el patróna  buscar");
c2=obDatos2.nextLine();	
return c2;
}
public void Patron(String c1,String c2) {
	p=Pattern.compile(c2); //éste es el patrón
    
	System.out.println("compilado"); 
	m=p.matcher(c1);//esta es la cadena que ingresa el usuario
	
	while(m.find()) { //mientras encuentres el patrón
		System.out.println("Patrón encontrado");
   }
}

	public static void main(String[] args) {
		MasRegex r=new MasRegex();
		obDatos= new Scanner(System.in);
		obDatos2= new Scanner(System.in);
		r.DatosAnalizar();
		r.DatosPatron();
		r.Patron(c1, c2);
	  }	
}


