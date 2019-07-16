public class DiagonalMatriz {
  private static int[][] m;
  
  
	public static void main(String[] args) {
		m=new int[3][3];
        DiagonalMatriz matriz=new DiagonalMatriz();
        matriz.vArray();
        matriz.rellenar(); //se generan de forma aleatoria los elementos de la matriz
        matriz.vMatriz();
	}

}