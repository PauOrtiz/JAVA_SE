package js;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Prueba {
	private static String Nombre;
    public Prueba(String Nombre){ //constructor
       Nombre="";
    }	
	public void setNombre(String Nombre){ 
		Prueba.Nombre=Nombre;
   }
   public String getNombre(){
    return Prueba.Nombre;
  }
public static void main(String args[]) {
ScriptEngineManager manager= new ScriptEngineManager();
ScriptEngine motor= manager.getEngineByName("nashorn");
try {
Object resultado= motor.eval("print('BIENVENIDO AL:')");
Prueba p= new Prueba(Nombre);
p.setNombre("Sistema de control veterinario");
motor.put("persona", p);
motor.eval("print(persona.getNombre())");
  } catch (ScriptException e) {
e.printStackTrace();
  }
 }
}