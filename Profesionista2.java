package herencia_polimorfismo;
package herencia_polimorfismo;

public class Profesionista2 extends Persona{

	public int getNumAfiliacion() {
		System.out.println("Datos del número de afiliación");//el método original fue redefinido
    	return numAfiliacion;
    	
    }
	//usando el método del padre
	public void original() {
	 System.out.println(super.getNumAfiliacion());	
	}
	public static void main(String[] args) {
		Profesionista2 nuevoP=new Profesionista2();
		Profesionista2 segundoNuevoP=new Profesionista2();
		nuevoP.setAfiliacion(67453);
		segundoNuevoP.setAfiliacion(12345);// ejecuta el método del padre
		segundoNuevoP.original();
	}
}
