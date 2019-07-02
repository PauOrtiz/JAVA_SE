import java.util.*;
public class HashTablePaises {
    private String pais; //se modela país como clave
    public HashTablePaises(String pais) {
    	this. pais=pais;
    }
	public static void main(String[] args) {
		//crear HashTable <clase/clave,valor)>
		Hashtable<HashTablePaises, String> t=new Hashtable<HashTablePaises,String>();
        HashTablePaises p=new HashTablePaises("América"); //capturo la clave en el objeto p
        t.put(p, "México"); //asigno la clave a p
        System.out.println("Contenido:"+ t.get(p));
	}

}
