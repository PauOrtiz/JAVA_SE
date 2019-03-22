package cadenasArreglos;
import java.util.Arrays;

public class arreglos {
	private int[] num= {1456,2019,3289,5678,9998,1021,3670,3089,2768,8976};
	public void recorrerArreglo(){
    	System.out.println("Los valores que contiene el arreglo son:\n");
     for(int i=0; i<10;i++) {
    	System.out.println("En el índice "+i+":\n"+ num[i]);
     }
    }
    public void ordenaArreglo() {
     Arrays.sort(num);//ordena de forma ascendente
     System.out.println("Los elementos del arreglo en orden son:\n");
     for(int i=0; i<10;i++) {
    	System.out.println(num[i]+"   "+ "En el índice  "+i);
      }
    }
     
	public static void main(String[] args) {
		arreglos miArreglo=new arreglos();
		miArreglo.recorrerArreglo();
		miArreglo.ordenaArreglo();	
	}
}