public class EjemploStringBuilder {
	String str= "Usando StringBuilder";
	StringBuilder str2= new StringBuilder(str);
	
	public void longitud() {
		System.out.println("La longitud de la cadena es:"+ str2.length());
	}
	public void imprimeConsola() {
		System.out.println("El contenido de la cadena es:"+"******"+ str2+"*****");
	}
	public static void main(String[] args) {
	 EjemploStringBuilder b= new EjemploStringBuilder();
	 b.imprimeConsola();
	 b.longitud();
	 
	}

}
