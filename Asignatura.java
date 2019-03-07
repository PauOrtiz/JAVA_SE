package geometría;

public class Asignatura{
String nombreAsignatura;
String claveAsignatura;
String nombreProfesor;
String diaImparticion;

public Asignatura(String Asignatura,String clave,String Profesor,String horario){ //EN LOS PAREMTRSO INDICAS LO QUE VAS A INICIALIZAR
nombreAsignatura=Asignatura; //EMPATAS LAS VARIABLES QUE TIENES CON LO QUE SE ESPERA QUE RECIBA
claveAsignatura=clave;
nombreProfesor=Profesor;
diaImparticion=horario;
}
public static void main(String[]args){
Asignatura miAsignatura=new Asignatura("Matemáticas","AS3","Aldo Martínez", "Jueves");
System.out.println(miAsignatura.nombreAsignatura+","+miAsignatura.claveAsignatura +","+miAsignatura.nombreProfesor+","+ miAsignatura.diaImparticion);
   }
}