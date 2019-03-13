import java.util.Scanner; 

public class PoligonoRegularScanner { //area pentágono=perimetro*apotema/2
 private  double p,a;
 private static double area; 
private static Scanner obScanner,obScanner2;


  public double obtenPerimetro(){
		System.out.print("Ingrese perímetro: ");
		p= obScanner.nextDouble();
		return p;
  }
  
  public double obtenApotema(){
		System.out.print("Ingrese apotema: ");
		a= obScanner2.nextDouble();
		return a;
  }
  public double areaPoligono(double ar) {
		//area=(p*a)/2;
		return area=(p*a)/2;
}
   
	public static void main(String[] args) {
	    PoligonoRegularScanner pentagono=new PoligonoRegularScanner();
		obScanner = new Scanner(System.in);
		obScanner2 = new Scanner(System.in);
		System.out.println("El perímetro del polígono regular es:"+pentagono.obtenPerimetro()  + "y su apotema:"+ pentagono.obtenApotema());
	    System.out.println("Por lo que su área es:"+ pentagono.areaPoligono(area ));
	}
}
