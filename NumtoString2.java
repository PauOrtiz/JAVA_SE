public class NumtoString2 {
 private static Scanner s;
 private int n;
    public int obInfo() {
    	System.out.println("Ingresa un número");
    	n= s.nextInt();
    	return n;
    }
    public String conversion(int n) {
    	String si=Integer.toString(n);
    	return si;
    	
    }
    public void comprobacion(String si) {
    	if(si instanceof String) {
    		System.out.println("buen trabajo");
    	} else {
    		System.out.println("La conversión no fue exitosa");
    	}
    }
	public static void main(String[] args) {
      NumtoString2 ss=new NumtoString2();
      s=new Scanner(System.in);
      ss.obInfo();
      ss.conversion(1);
      ss.comprobacion(" ");
	}

}
