import java.util.*;
  
  public class Queues 
{ 	
   public  void operaciones() {
	   Queue<Integer> cola = new LinkedList<>(); 
	   for (int i=0; i<10; i++) 
		    cola.add(i); 
		    System.out.println("Elementos:"+cola); 
		    int remuevePrincipio = cola.remove(); 
		    System.out.println("Elemento removido:" + remuevePrincipio);  
		    int h = cola.peek(); 
		    System.out.println("El primer elemento de la cola es:" + h); 
		  
		    /* Otros métodos a implementar
		    ...*/
		    int n = cola.size(); 
		    System.out.println("Tamaño de la estructura:" + n); 
 }
  public static void main(String[] args) 
  { 
    Queues opColas=new Queues();
    opColas.Operaciones();   
  } 
} 