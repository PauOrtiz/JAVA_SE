package sentencias;

public class Sobrecarga {
    private int a, b;
    public int sumar(int a,int b) { //los parámetros deben corresponderse en identificador
    	return a+b;
    }
    public String sumar(String a,String b) {
    	return a+""+b;
    }

	public static void main(String[] args) {
		Sobrecarga sumas= new Sobrecarga();
		System.out.println("El resultado de la suma es:"+ sumas.sumar(20, 30));
		System.out.println("El resultado de la suma es:"+ sumas.sumar("hola", "yu chan"));
	}
}
