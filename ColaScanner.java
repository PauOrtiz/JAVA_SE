import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Iterator;

ppublic class ColaScanner {
	Queue<String> cS=new LinkedList<>();
	private static Scanner obDatos;
	private String d;
	private Object element;
	
    public void obDatos() {//ingresa y agrega
    	for(int i=0; i<3;i++) {
    	System.out.println("Ingresa los elementos de la lista:");
    	d= obDatos.nextLine();
    	cS.add(d);
         }
    }
    public void imprimir() { //recorrer la cola e imprimir
    	System.out.println("El contenido es:");
        Iterator<String> it =cS.iterator();
    	while(it.hasNext()) {
    		element = it.next();
    		System.out.println("elementos"+ element);
    	}
    }
   
	public static void main(String[] args) {
		ColaScanner dato= new ColaScanner();
		obDatos=new Scanner(System.in);
		dato.obDatos();
		dato.imprimir();
	}

}
