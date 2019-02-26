public class Triangulo{ 
static private float base=15.45; 
 public Triangulo() { 
   } 
 public void  areaTriangulo(){ 
     privated float altura=2.5,area;
      area=(base*altura)/2;
      System.out.println( "El área es" + area);
  }  
  public static  void main(String[]args)  {
      Triangulo miTriangulo=new Triangulo();
      Triangulo.areaTriangulo();
  }     
}