package js;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class Prueba {
	
	public void setNombre(String s){
		
}
public static void main(String args[]) {
ScriptEngineManager manager= new ScriptEngineManager();
ScriptEngine motor= manager.getEngineByName("nashorn");
try {
Object resultado= motor.eval("print('hola')");
Prueba p= new Prueba();
p.setNombre("maria");
motor.put("persona", p);
motor.eval("print(persona.getNombre())");
} catch (ScriptException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}