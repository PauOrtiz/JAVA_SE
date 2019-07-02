import java.util.HashMap;
import java.util.Map.Entry;
import java.util.ArrayList;
public class Mapa {
	public static HashMap <String, String> paises=new HashMap<String, String>();//almacena en un arrayList los valores
   public void agregar() {
	   paises.put("América", "Argentina");
	   paises.put("Europa", "Francia");
	   paises.put("Asia", "Japón");
   }
   public void mostrar() {
	   
	   System.out.println("elementos:"+ m.getKey()+ m.getValue() );
   }
	public static void main(String[] args) {
		
		Mapa m= new Mapa();
		m.agregar();

	}

}