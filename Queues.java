import java.util.*;
  
  import java.util.*;
  
public class Queues 
{ 
	private int n;
	 Queue<Integer> cola = new LinkedList<>(); 
   public  void operaciones() {
	  
	   for (int i=0; i<10; i++) 
		    cola.add(i); 
		    System.out.println("Elementos:"+cola); 
		    int remuevePrincipio = cola.remove(); 
		    System.out.println("Elemento removido:" + remuevePrincipio);  
		    int h = cola.peek(); 
		    System.out.println("El primer elemento de la cola es:" + h); 
		  
		    /* Otros métodos a implementar
		    ...*/
		    n = cola.size(); 
		    System.out.println("Tamaño de la estructura:" + n); 
     }
   public void desencolar() {
	   while(cola.poll()!=null) {
		System.out.println("El nuevo frente de la cola es:"+cola.peek());
	    }
    }
  public static void main(String[] args) 
  { 
    Queues opColas=new Queues();
    opColas.operaciones();
    opColas.desencolar(); 
  } 
} 