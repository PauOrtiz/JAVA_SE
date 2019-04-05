import java.util.Scanner;
public class Lanzamiento extends Persona {
	private static Scanner obScanner;
	private int expProf;
	private void exProfesional() throws Exception {
		System.out.println("Introduzca el número de años de experiencia profesional con los que cuenta");
	    expProf=obScanner.nextInt();
	    
	    if(expProf>1.5 ) {
	    	System.out.println("El incremento de su salario para este año será del 3%");
	   
	}else {
	    	//System.out.println("Como becario usted aún no percibe un salario");
	        
	        	if(expProf <1) {
	        		throw new Exception ("Como becario usted aún no percibe un salario");
	        	}
	      }
	  }
	public static void main(String[] args) {
		try {
		Lanzamiento nuevaExcepcion=new Lanzamiento();
		nuevaExcepcion.setNombre("Marina Arezu");//utilizas los métodos de la superclase
		System.out.println("Bienvenida: "+ nuevaExcepcion.getNombre());
		obScanner=new Scanner(System.in);
		nuevaExcepcion.exProfesional();	

	}catch(Exception e)
		{
			 System.out.println(e.getMessage());
		}

  }
}