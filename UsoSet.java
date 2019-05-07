package colecciones;
import java.util.*;

public class UsoSet
{ 
	Set <String> mascota_set= new HashSet<String>();
	Set <String> mascota_salud= new HashSet<String>();
	
	private void datosMascota() {//añadir
		mascota_set.add("Mascota: Michelle Arezu");
		mascota_set.add("Cumpleaños: 3/09");
		mascota_set.add("Dueño: Marina Arezu"); 
	    mascota_set.add("Mascota: Michelle Arezu"); 
	    mascota_set.add("Mail: arezu@gmail.com"); 
	    mascota_set.add("Mail: arezu@gmail.com");
	    System.out.println("Los elementos ingresados son:\n" + mascota_set);
	}
	private void datosMascotaSalud() {//añadir
		mascota_salud.add("Vacunas: Sextuple,Bordetella");
		mascota_salud.add("Desparasitación: Octubre");
		mascota_salud.add("Dueño: Marina Arezu"); 

	    System.out.println("Estado actual de salud:\n" + mascota_salud);
	}
	private void ordenar() {
		Set<String>ordena_set=new TreeSet<String>(mascota_set);
		System.out.println("Los elementos en orden son:\n" + ordena_set);
	}
	private void comparar() {
		boolean value;
		//determina si ambos hashSet son iguales
		if( value=mascota_set.equals(mascota_salud) ) {
			System.out.println("Ambos son iguales");	
		}else {
			System.out.println("Los HashSet son diferentes");
		}	
	}
		
    public static void main(String[] args) 
    { 
       UsoSet m=new UsoSet();
       m.datosMascota();
       m.ordenar(); 
       m.datosMascotaSalud();
       m.comparar();
    } 
} 
