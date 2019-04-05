public class Profesionista2 extends Persona{
	
//@override //le estás indicadndo al compilador que sobrescribirá un método por eso te está mostrando el tache
	public int getNumAfiliacion() {
		System.out.println("Datos del número de afiliación");//el método original fue redefinido al agregarle esta línea
		return numAfiliacion;	
    }
	//usando el método del padre
	public int original() {
	 return super.getNumAfiliacion();	//super para referirse al método de la superclase--> invoco al método de la superclase, el original
	}
	public static void main(String[] args) {
		Profesionista2 nuevoP=new Profesionista2();
		Profesionista2 segundoNuevoP=new Profesionista2();//creo dos instancias para aplicar tanto el método sobrescrito como el original
		nuevoP.setAfiliacion(67453);//este es el método sobreescrito
		segundoNuevoP.setAfiliacion(12345);//oculta el valor que se le dio originalmente al padre
		System.out.println("La ejecución del método sobrescrito es:"+ nuevoP.getNumAfiliacion());
		System.out.println( "La ejecución del método del padre es:"+ segundoNuevoP.original());// ejecuta el método del padre	
	}
}
