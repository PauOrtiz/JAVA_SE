
public class Password {
  private int longitud;
  private String contraseña;
   public Password(int l) {
	 this.longitud=l; 
   }
   
   public void setContraseña(String c) {
	   this.contraseña=c;
   }
   public int getContraseña() {
	   return contraseña; 
   }
   public void setLongitud(int l) {
	   this.longitud=l;
   }
   public int getLongitud() {
	   return longitud;
   }
   
   public boolean esFuerte() {
	   return;
   }
   
   public void generarPassword() {
	   
   }
	public static void main(String[] args) {
		Password p=new Password();
	}

}

