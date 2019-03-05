package geometría;
import java.util.Scanner;

public class AreaRectangulo {
	public static void main(String[] args) {
        double area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa el valor de la base del rectangulo");
        double a=sc.nextDouble();  
        System.out.println("Ingresa la altura del rectangulo");
        double b=sc.nextDouble(); 
        area=a*b;
        System.out.println("El área del rectángulo es:"+ area);                
     }
}
