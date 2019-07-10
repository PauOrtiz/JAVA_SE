import java.util.Scanner;
import java.lang.*;


public class EjemploStringBuilder {
	private String str= "Usando StringBuilder",ss;
	int s, s2;
	static int op,ops2;
	private StringBuilder str2= new StringBuilder(str);
	private StringBuilder str3= new StringBuilder();
	private static Scanner obdatos,obd,ops;
	
	public void longitud() {
		System.out.println("La longitud de la cadena es:"+ str2.length());
	}
	public void extraer() {
		System.out.println("Ingresa la cantidad de caracteres a leer:");
		s=obdatos.nextInt();
		str2.setLength(s);//realiza la operación sobre el argumento y ese es el nuevo valor para str2
		System.out.println("La cadena es:" + str2);
		}
	
	public void imprimeConsola() {
		System.out.println("El contenido de la cadena es:"+"******"+ str2+"*****");
	}
	public void reemplazar() {
		System.out.println("Ingresa la cadena que ocupará el lugar de \"b\" en la cadena:");
		ss=obd.next();	
		str3 =str2.replace(	5,s, ss);   
	    System.out.println("La nueva cadena es:"+ str3.toString() );
	   obd.close(); 
	}   
	
	public static void main(String[] args) {
	 EjemploStringBuilder b= new EjemploStringBuilder();
	 obdatos=new Scanner(System.in);
	 obd=new Scanner(System.in);
	 ops=new Scanner(System.in);
	 do{
			System.out.println("Elige una opción del menú:");
			System.out.println("1. IMPRIMIR EN CONSOLA\n");
			System.out.println("2. CALCULA LA LONGITUD DE LA FRASE\n");
			System.out.println("3. EXTRAER DE LA FRASE\n");
			System.out.println("4. REEMPLAZAR DE LA FRASE\n");
		    ops2=ops.nextInt();
			}while(ops2>5);
	 
		switch(ops2)  {
		case 1: b.imprimeConsola();
		break;
		case 2:b.longitud();
		break;
		case 3:  b.extraer();
		break;
		case 4:  b.reemplazar();
		break;
		} 
	}

}
