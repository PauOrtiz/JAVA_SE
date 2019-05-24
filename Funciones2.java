import java.io.*;//para FileReader
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Funciones2 {

		public static void main(String[] args) throws ScriptException, NoSuchMethodException, FileNotFoundException{
			ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
			engine.eval(new FileReader("src/js/javaScriptF.js"));
			Invocable invocable = (Invocable) engine;
			Object result = invocable.invokeFunction("despliegaCachorros", " ");
			System.out.println(result);
			System.out.println(result.getClass());
		}
	}