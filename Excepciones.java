public class CadenaArreglo extends arreglos {
 private String cadena="Manejo de excepciones en Java";
 private char[] arr= cadena.toCharArray();
 //@override
 public void recorrerArreglo(){ //redefinición del método
 	System.out.println("Los valores del arreglo son");
    
 	for(int i=0; i<arr.length;i++) {
 	System.out.println(arr[i]);
      }
 }
  	public static void main(String[] args) {
		CadenaArreglo nuevoArreglo=new CadenaArreglo();
		nuevoArreglo.recorrerArreglo();
	}
 }