import java.util.ArrayList;
import java.util.stream.Stream;

public class Presupuesto {
   private int rh, sistemas, contabilidad; 
   public Presupuesto(int rh,int sistemas,int contabilidad)
   {
	 this.rh=rh;
	 this.sistemas=sistemas;
	 this.contabilidad=contabilidad;
   }
   //TRATANDO COMO UN UN ARRAY
   public void listarPresupuesto(){
	 //conviertes los valores de los atributos de la clase en un arreglo
	ArrayList <Presupuesto> listadoPresupuesto=new ArrayList<Presupuesto>();
	Stream<Presupuesto> r=listadoPresupuesto.stream()
	.filter(listadoPresupuesto->listadoPresupuesto>16500);
	System.out.println(r);
   }
	public static void main(String[] args) {
		Presupuesto p=new Presupuesto(16500,56700,34567);
                    p.listarPresupuesto();
	}

}
