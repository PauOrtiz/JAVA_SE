package geometría;

public class AreaCirculoMetodoClase {//a=pi*r2
	static final double PI=3.1416;
	private double radio;
	private static double area;
	public AreaCirculoMetodoClase(){
		radio=156.789;
	}
	public void NuevoCalculo() {
		area=PI*Math.pow(radio, 2);
	}

	public static void main(String[] args) {
		AreaCirculoMetodoClase nuevaAreaCirculo=new AreaCirculoMetodoClase();
		nuevaAreaCirculo.NuevoCalculo();
	    System.out.println("El área del círculo es:" + area);
		
	}//un método de clase requiere de un objeto
}
