package geometría;
import java.lang.*;

public class Cilindro {
	static final double PI = 3.1416;
	private double radio,altura;
	public static double volumen;
	//las variables se declaran como privadas para limitar su acceso, esto es a lo que se refiere el encapsulamiento,https://javautodidacta.es/instanciar-un-objeto-en-java/#tab-con-4
	   public Cilindro() { //constructor
	radio=19.8;
	altura=4.2;
	   } 
	 public void  volumenCilindro(){ //método para calcular el volumen del cilindro
	      volumen= PI*(Math.pow(radio,2))*altura;
	      System.out.println( "El volumen del cilindro es" + volumen);
	      
	  }  
	public static void main(String[] args) {
		Cilindro miCilindro=new Cilindro();
	    miCilindro.volumenCilindro();
	    System.out.println( "El volumen del cilindro es" + volumen);
	}

}