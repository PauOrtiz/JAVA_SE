
public class Rectangulo { 
    private double base;
    private double altura;
	public Rectangulo(double b, double h) {
		base=b;
		altura=h;
    }
	public double perimetro() //implementación del método abstracto
	{
		return ( 2*base+2*altura);
	}
	public void setBase(double b) {
		this.base=b;
	}
	public void setAltura(double h) {
		this.altura=h;
	}
	public double getBase() {
		return base;
	}
	public double getAltura() {
		return altura;
	}
	 public static void main(String[] args)
	 {	
	   Rectangulo miRectangulo = new Rectangulo (10,5);
	   miRectangulo.perimetro();
	   System.out.println("El perímetro del rectángulo es:"+miRectangulo.perimetro());	
	 }
}
