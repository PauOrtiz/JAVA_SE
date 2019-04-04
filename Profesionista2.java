package herencia_polimorfismo;

public class Profesionista2 extends Persona{

	public int getNumAfiliacion() {
		System.out.println("Datos del número de afiliación");//el método original fue redefinido
    	return numAfiliacion;
    	
    }
	public static void main(String[] args) {
		Profesionista2 nuevoP=new Profesionista2();
		nuevoP.setAfiliacion(67453);
		System.out.println(nuevoP.getNumAfiliacion());
	}
}