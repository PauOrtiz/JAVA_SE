
public class RectanguloInterface extends Rectangulo implements InterfaceGeometria { 
    private double base;
    private double altura;
    public RectanguloInterface(double i, double j) {
    	super(i, j); // constructor de la clase derivada hacia el padre
    	this.base=i;
    	this.altura=j;
    }
   
 @Override
	public double perimetro() {
		System.out.println("El perímetro es:");
		return ( 2*base+2*altura); //utiliza los valores del constructor por defecto
	}
	public double area() {
		return base*altura;
	}
	 	
	public static void main(String[] args) {
		RectanguloInterface nuevoRectangulo=new RectanguloInterface(5,5);
		
		System.out.println(nuevoRectangulo.perimetro());
		System.out.println("El área es:" + nuevoRectangulo.area());
	  }
	}
