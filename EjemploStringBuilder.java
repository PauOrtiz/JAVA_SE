public class EjemploStringBuilder {

	private String str= "Usando StringBuilder",ss;
		int s, s2;
	private StringBuilder str2= new StringBuilder(str);
	private static Scanner obdatos,obd;
	
	public void longitud() {
		System.out.println("La longitud de la cadena es:"+ str2.length());
	}
	public void extraer() {
		System.out.println("Ingresa la cantidad de caracteres a leer:");
		s=obdatos.nextInt();
		str2.setLength(s);//realiza la operación sobre el argumento y ese es el nuevo valor para str2
		System.out.println("La cadena es:" + str2);
		}
	public void reemplazar() {
		System.out.println("Ingresa la cadena que ocupará el lugar de \"caracteres\" en la cadena:");
		ss=obd.nextLine();	
	    System.out.println("La nueva cadena es:"+ str.replace("caracteres", "ss") );
	}   
	public void imprimeConsola() {
		System.out.println("El contenido de la cadena es:"+"******"+ str2+"*****");
	}
	
	public static void main(String[] args) {
	 EjemploStringBuilder b= new EjemploStringBuilder();
	 obdatos=new Scanner(System.in);
	 b.imprimeConsola();
	 b.longitud();
	 b.extraer();
	 b.reemplazar();
	 
	}

}