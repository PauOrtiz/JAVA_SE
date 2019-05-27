package js;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Prueba {
	private static String Curso;
    public Prueba(String Curso){ //constructor
       Curso=" ";
    }	
	public void setCurso(String Curso){ 
		Prueba.Curso=Curso;
    }
   public String getCurso(){
    return Prueba.Curso;
   }
public static void main(String args[]) {
ScriptEngineManager manager= new ScriptEngineManager();
ScriptEngine m= manager.getEngineByName("nashorn");
try {
m.eval("print('BIENVENIDO AL CURSO:')");
Prueba p= new Prueba(Curso);
p.setCurso("Fundamentos de Java SE");
m.put("llave", p);
m.eval("print(llave.getCurso())");
  } catch (ScriptException e) {
e.printStackTrace();
   }
  }
}
