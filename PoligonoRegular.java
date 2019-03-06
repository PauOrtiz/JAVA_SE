package geometría; //uso de parámetros en constructor, uso de getters 

public class PoligonoRegular { //a=perimetro*apotema/2
 private static double p,a;
  private static double area;
 
  public PoligonoRegular(double p, double a) {
	 this.p=p;//con this haces referencia al objeto actual
	 this.a=a;
  }
  public double getPerimetro() {//este es un getter y devuelve el perímetro
	  return p;
  }
  public double getApotema() {
	  return a;
  }
  public double areaPoligono() {
	area=(p*a)/2;
	return area;
  }
  
	public static void main(String[] args) {
		PoligonoRegular pentagono=new PoligonoRegular(123.45,17.89);
		//muestras el valor de p
		System.out.println("El perímetro del polígono regular es:"+ pentagono.getPerimetro() + "y su apotema:"+ pentagono.getApotema());
	    pentagono.areaPoligono();
	    System.out.println("Por lo que su área es:"+ pentagono.areaPoligono());
	}
}