package cadenasArreglos; //matriz aleatoria java

public class Matriz {
	private int x,y;
	int m[][]=new int[3][3];
	
    public void rellena() {
    	 for ( x=0; x < m.length; x++) {
    		  for (y=0; y < m[x].length; y++) {
    		    m[x][y] = (int) (Math.random()*9+1); //casting de double a int
    		  }
    	} 
     }
     
     public void recorrerArreglo(){
    	    	System.out.println("Los valores que contiene el arreglo son:\n");
    	     for(int i=0; i<m.length;i++) {
    	    	 for(int j=0;j<m[i].length;j++) {
    	    		 System.out.println( m [i][j]+"   " + "en el índice:"+"x="+ i +"  "+"y= "+ j); 
    	    	 }	
    	     }	 
      }
	public static void main(String[] args) {
		Matriz miMatriz=new Matriz();
		miMatriz.rellena();
		miMatriz.recorrerArreglo();
	   }
	}