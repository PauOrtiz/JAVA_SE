import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Motor {

 public static void main(String[] args) throws ScriptException {
  ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
  ScriptEngine n = scriptEngineManager.getEngineByName("nashorn");
  n.eval("print('Hola Mundo')");
 }

}