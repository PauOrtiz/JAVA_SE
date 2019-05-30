
import javax.script.Bindings;
import javax.script.SimpleBindings;
public class BindingPrueba { //Binding enlace de clases y métodos de forma clave, valor
	
	
	public static void main(String[] args) {
		Bindings p= new SimpleBindings();
		p.put("cachorra", "michelle");
        //Extracción del contenido
		Object cachorra=p.get("cachorra");
		System.out.println("cachorra=" + cachorra);
	}
}