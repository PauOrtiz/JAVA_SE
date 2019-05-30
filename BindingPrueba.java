
import javax.script.Bindings;
import javax.script.SimpleBindings;
public class BindingPrueba { //Binding enlace de clases y métodos de forma clave, valor
	
	
	public static void main(String[] args) {
		Bindings p= new SimpleBindings();
		p.put("cachorra", "michelle");
        p.put("raza", "mix de pastor belga");
        //Extracción del contenido
		Object cachorra=p.get("cachorra");
		System.out.println("cachorra=" + cachorra);
		Object raza=p.get("raza");
        System.out.println("raza=" + raza);
        //Removiendo
        p.remove("cachorra");
        cachorra=p.get("cachorra");
        System.out.println("Nombre de la cachorra:"+ cachorra);
	}
}