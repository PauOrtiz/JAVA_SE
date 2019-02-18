public class cilindro{ //cálculo del volumen de un cilindro, fórmula v=pi*radio al cuadrado*altura
double radio,altura,volumen;
   public cilindro() { //constructor
radio=19.8;
altura=4.2;
   } 
 public void  volumenCilindro(){ //método para calcular el volumen del cilindro
      volumen=3.1416*radio*radio*altura;
      System.out.println( "El volumen del cilindro es" + volumen);
  }  
  public static  void main(String[]args)  {
      cilindro miCilindro=new cilindro();
      miCilindro.volumenCilindro();
  }     
}