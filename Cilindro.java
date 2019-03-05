package geometría;

public class Cilindro {
	static final double PI = 3.1416;
	private double radio,altura;
	public static double volumen;
	   public Cilindro() { //constructor
	radio=19.8;
	altura=4.2;
	   } 
	 public void  volumenCilindro(){ //método para calcular el volumen del cilindro
	      volumen= PI*(Math.pow(radio,2))*altura;
	  
	    	  }  
	public static void main(String[] args) {
		Cilindro miCilindro=new Cilindro();
	    miCilindro.volumenCilindro();
	    System.out.println( "El volumen del cilindro es \n" + miCilindro.volumen); 
	}

}
