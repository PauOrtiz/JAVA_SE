
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class DiferentesScripts {
	public static void execute(ScriptEngineManager m, String enName, String script) {
	    ScriptEngine en=m.getEngineByName(enName);
	    if(en==null) {
	    	System.out.println("No disponible");
	    	return;
	    }
	    	try{
	    		en.eval(script);
	    	}catch(ScriptException e) {
	    		e.printStackTrace();
	    	}
	    }
	public static void main(String[] args) {
		ScriptEngineManager m= new ScriptEngineManager();
		execute(m,"JavaScript", "print('Vía JS')");
		execute(m,"jython", "print('Vía Jython')");
		execute(m,"jruby", "puts('Vía JRuby')");
	}
}