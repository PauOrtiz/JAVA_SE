import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ColaScanner {
	Queue<String> cS=new LinkedList<>();
	private static Scanner obDatos;
	private String d;
    public void obDatos() {
    	for(int i=0; i<3;i++) {
    	System.out.println("Ingresa los elementos de la lista:");
    	d= obDatos.nextLine();
    	cS.add(d);
         }
    }
   
	public static void main(String[] args) {
		ColaScanner dato= new ColaScanner();
		obDatos=new Scanner(System.in);
		dato.obDatos();
	}

}