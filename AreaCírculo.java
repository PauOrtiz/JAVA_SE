package geometría;

public class AreaCirculo { //a=pi*radio al cuadrado
	static final double PI=3.1416;
	private static double radio,area;
	
	 public static void CalculoArea() {
		 area=(PI*Math.pow(radio,2));	 
	 }
	 
	public static void main(String[] args) {
		AreaCirculo.radio=345.34;
		CalculoArea(); //invocas al método e imprimes su valor, si no lo haces siempre arrojará cero
		System.out.println("Para un radio de:\n"+AreaCirculo.radio+"\n" + "El área del círculo es:\n"+area);		
	}
}
