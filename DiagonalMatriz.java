public class DiagonalMatriz {
  private static int[][] m;
   
  public void inicializar(int[][ ]pMatriz) {
	 
	        int aux = 1;
	        for(int i=0;i<pMatriz.length;i++){
	            for(int j=0;j<pMatriz[i].length;j++){
	                pMatriz[i][j] = aux;
	                aux++;
	            }
	        }
	    }
 
	public static void main(String[] args) {
		m=new int[3][3];
        DiagonalMatriz matriz=new DiagonalMatriz();
        matriz.inicializar(m); //se generan de forma aleatoria los elementos de la matriz
        matriz.visualizarArray();
        matriz.visualizarMatriz();
	}

}