package excepctionJava;

public class CadenaArreglo extends arreglos {
 private String cadena="Manejo de excepciones en Java";
 private char[] arr= cadena.toCharArray();
 //@override
 public void recorrerArreglo(){ //redefinición del método
 	System.out.println("Los valores del arreglo son");
    
 	for(int i=0; i<arr.length;i++) {
 	System.out.println(arr[i]);
      }
 	try { //el bloque conflictivo
 	System.out.println("El contenido de arr[-10] es:"+ arr[-10]); //no existen índices negativos por lo que se produce una excepción del tipo java.lang.ArrayIndexOutOfBoundsException
 	  } //cierre
 	catch(ArrayIndexOutOfBoundsException excepcion)
 	{
 		 System.out.println(" Imposible acceder");
 	}finally {
 		System.out.println("Bloque try...catch finalizado");
 	}
 }
  	public static void main(String[] args) {
		CadenaArreglo nuevoArreglo=new CadenaArreglo();
		nuevoArreglo.recorrerArreglo();
	}
 }