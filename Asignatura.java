public class Asignatura{
String nombreAsignatura;
int claveAsignatura;
String nombreProfesor;
String diaImparticion;

public Asignatura(String Asignatura,int clave,String Profesor,String horario){ //EN LOS PAREMTRSO INDICAS LO QUE VAS A INICIALIZAR
nombreAsignatura=Asignatura; //EMPATAS LAS VARIABLES QUE TIENES CON LO QUE SE ESPERA QUE RECIBA
claveAsignatura=clave;
nombreProfesor=Profesor;
diaImparticion=horario
}
public static void main(String[]args){
Asignatura miAsignatura=new Asignatura("Matemáticas",890,"Aldo Martínez", "Jueves");
System.out.println(miAsignatura.asignatura+","miAsignatura.clave+","+miAsignatura.nombreProfesor+","+ miAsignatura.diaImparticion);
   }
}