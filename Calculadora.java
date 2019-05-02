package sentencias;

import java.util.Scanner;

public class CalculadoraSwitch {
	private static int opcion,num1,num2,resultado;
	private static Scanner obScanner;
	
	public CalculadoraSwitch(int n1, int n2) {
		this.num1=n1;
		this.num2=n2;
	}
	
	public void obNumeros() {
		System.out.println("Ingresa el primer número");
		num1=obScanner.nextInt();
		System.out.println("Ingresa el segundo número");
		num2=obScanner.nextInt();
	}
	public void suma() {
		obNumeros();
		resultado = num1+num2;
		System.out.println("El resultado de la suma es:"+ resultado);			
	}
	public void resta() {
		obNumeros();
		resultado = num1-num2;
		System.out.println("El resultado de la resta es:"+ resultado);
	}
	public void multiplicacion() {
		obNumeros();
		resultado = num1*num2;
		System.out.println("El resultado de la multiplicación es:"+ resultado);
	}
	public void division() {
		obNumeros();
		resultado = num1/num2;
		System.out.println("El resultado de la división es:"+ resultado);
	}
	public void EligeOperacion() {
		switch(opcion) {
		case 1:
			suma();
		break;
		case 2:
			resta();
		break;
		case 3:
			multiplicacion();
		break;
		case 4:
			division();
		break;
		}
	}
	
	public static void main(String[] args) {
		
      CalculadoraSwitch c=new CalculadoraSwitch(num1, num2);
      do {
      System.out.println("Elige alguna de las siguientes opciones");
		System.out.println("1:Sumar");
		System.out.println("2:Restar");
		System.out.println("3:Multiplicar");
		System.out.println("4:Dividir");
		obScanner= new Scanner(System.in);
		opcion=obScanner.nextInt();
		c.EligeOperacion ();
      }while(opcion>4 || opcion<1) ;  
	}

}

