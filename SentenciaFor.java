package sentencias; //DESPLIEGA LAS TABLAS DE MULTIPLICAR DEL 1 AL 5

public class SentenciaFor {
private int i,j;
  public void tablaMultiplicar() {
	  for (i=1;i<=5;i++) {
		  System.out.println("Tabla de multiplicar del " + i);
          for ( j =1;j<=5 ; j++) {
              System.out.println(i  + " * " + j + " =" + i*j);  
              }
           }
	 }
  public static void main(String[] args) {
		SentenciaFor Datos=new SentenciaFor();
		  Datos.tablaMultiplicar();	 
	}
}
