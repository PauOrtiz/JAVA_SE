public class Suma{ 
private int num1,num2,suma; 
   public Suma() { //constructor
num1=250;
num2=560;
   } 
 public void  sumarNums(){ 
      suma=num1+num2;
      System.out.println( "El resultado de la suma es " + suma);
  }  
  public static  void main(String[]args)  {
      Suma miSuma=new Suma();
      miSuma.sumarNums();
  }     
}