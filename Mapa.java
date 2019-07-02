import java.util.HashMap;

public class Mapa {
	public static HashMap <String, String> paises=new HashMap<String, String>();
   public void agregar() {
	   paises.put("América", "Argentina");
	   paises.put("Europa", "Francia");
	   paises.put("Asia", "Japón");
   }
   public void mostrar() {
	   
	   paises.forEach((k,v)->System.out.println("elementos:"+ k + ":Valor:"+v));
   }
	public static void main(String[] args) {
		
		Mapa m= new Mapa();
		m.agregar();
		m.mostrar();

	}

}

