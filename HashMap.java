package colecciones;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UsoMap {
	Map<Integer, String> map = new HashMap<Integer, String>();
    
    private void datosMap(){
       System.out.println("********* HashMap *********");
		
		map.put(1, "Belga");		
		map.put(3, "Pastor alemán");		
		map.put(11, "Viejo pastor inglés");	
		map.put(16, "Poodle");	
		map.put(18, "Labrador");		
		map.put(7, "Chihuahua");
    }//fin datosMap()
   
		// Imprimimos el Map con un Iterador
    private void imprimir() {
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()){
		  Integer key = it.next();
		  System.out.println("Clave: " + key + " -> Valor: " + map.get(key)); 
          }
		}
    private void eliminar() {
    	map.remove(1, "Belga");
    	System.out.println("*****Una vez que se elima el elemento*****");
		imprimir();
		}
    private void eTodo() {
    	System.out.println("*****Elimina todo*****");
    	map.clear();
    }
    
	public static void main(String[] args) {
       UsoMap m=new UsoMap();
       m.datosMap();
       m.imprimir();
       m.eliminar();
       m.eTodo();		
	}
}