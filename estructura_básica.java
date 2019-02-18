public class MiEdad{
    int año_nacimiento,año_actual,edad; //atributos
    public MiEdad{//constructor
    año_nacimiento=1992;
    año_actual=2019;
    edad=año_actual-año_nacimiento;
    }
    public static void main(String[]args){ //método de instancia
        MiEdad miEdad_objeto=new MiEdad();
        System.out.println(miEdad_objeto.edad);
    }
}