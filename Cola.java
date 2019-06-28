import java.util.Queue;
import java.util.LinkedList;

public class Cola {
	Queue <String> c=new LinkedList<String>();//CREACIÓN DEL OBJETO COLA, PUEDO DEFINIRLO AQUÍ O EN MAIN
    public void agregar() {
    	c.add("Seiya");
    	c.add("Shun");
    	c.add("Atena");
    	c.add("Seiya");
    	c.add("Shun");
    	c.add("Atena");
    }
    public void imprimir() {
    	System.out.println("Elemento:" + c);
    }
    public void quitar(){
        String  q=c.remove();
        System.out.println(" removiendo el primero"+c);
     }
	public static void main(String[] args) {
		Cola l=new Cola();
		l.agregar();
		l.imprimir(); 
		l.quitar();
	}

}