package geometría;


public class AreaPentagono { //a=perimetro*apotema/2
    private static double p,a,area;
 public void setPerimetro(double p) {
	  this.p=p;	 
  }
  public void setApotema(double a) {
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
		AreaPentagono pentagono=new AreaPentagono();
		pentagono.setPerimetro(123.45);
		pentagono.setApotema(56.87);
		//muestras el valor de p
		System.out.println("El perímetro del polígono regular es:"+ pentagono.getPerimetro() + "y su apotema:"+ pentagono.getApotema());
	    pentagono.areaPoligono();
	    System.out.println("Por lo que su área es:"+ pentagono.areaPoligono());
	}
}