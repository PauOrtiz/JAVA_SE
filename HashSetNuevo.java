import java.util.*;  
class HashSetNuevo{  
 public static void main(String args[]){  
  HashSet<String> set=new HashSet<String>();  
           set.add("Michel");  
           set.add("Blacky");  
           set.add("Nina");  
           set.add("Vicky");  
           System.out.println("Lista inicial: "+set);   
           set.remove("Nina");  
           System.out.println("Despúes de remove: "+set);  
           HashSet<String> set1=new HashSet<String>();  
           set1.add("Andy");  
           set1.add("Lucas");  
           set.addAll(set1);  
           System.out.println("Actualización: "+set);  
           set.removeAll(set1);  
           System.out.println("Después de removeAll() : "+set);    
           set.removeIf(str->str.contains("Lucas"));    
           System.out.println("Después de removeIf() : "+set);   
           set.clear();  
           System.out.println("Despúes de clear(): "+set);  
 }  
} 