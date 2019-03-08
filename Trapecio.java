package geometría;

public class Trapecio {
    private int baseMayor,baseMenor,altura;
 public Trapecio(int bMax,int bMin,int h) {
     this.baseMayor=bMax;
	 this.baseMenor=bMin;
	 this.altura=h;	 
 }
	public static void main(String[] args) {
		Trapecio miTrapecio= new Trapecio(56,67,34);
		System.out.println("Se calculará el área del trapecio con los siguientes valores\n"+"Base Mayor="+ miTrapecio.baseMayor+","+ "Base Menor="+miTrapecio.baseMenor+","
		+"Altura="+miTrapecio.altura);
	}
}
