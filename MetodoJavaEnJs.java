
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MetodoJavaEnJs {
	public static void main(String[] args) {
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		try {
		engine.eval(new FileReader("src/js/javaScriptF.js"));
		Invocable invocable = (Invocable) engine;
		invocable.invokeFunction("suma", 10, 20); //la función js y sus parámetros
		}catch(ScriptException|FileNotFoundException|NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
 
	public static int suma(int input1, int input2) {
		return input1+ input2;
	}
}
	
	

