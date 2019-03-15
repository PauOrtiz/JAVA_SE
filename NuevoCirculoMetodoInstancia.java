public class AreaCirculoMetodoInstancia {//a=pi*r2
	static final double PI=3.1416;
	private double radio, area;
	/*public AreaCirculoMetodoInstancia(double r){
		this.radio=r;
	}*/
	public double setRadio(double r) {
		this.radio=r;
		return r;
	}
	public double NuevoCalculo()
	{
		
		area=PI*Math.pow(radio, 2);
		return area;
	}
	public double getArea() {
		  return area;
	  }
	public static void main(String[] args) {
		AreaCirculoMetodoInstancia nuevaAreaCirculo=new AreaCirculoMetodoInstancia ();
		nuevaAreaCirculo.setRadio(1456.9);
		nuevaAreaCirculo.NuevoCalculo();
		System.out.println("El área del círculo es:"+ nuevaAreaCirculo.getArea());
	} //un método de instancia requiere de un objeto
}
