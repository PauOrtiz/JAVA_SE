package herencia_polimorfismo;

public abstract class FiguraGeometrica { 
  public  abstract double perimetro();
  public String toString()
  {
	  return "perímetro=" + perimetro();
  } 
}
