public class DiagonalMatriz {
  private static int[][] m;
  private static int[] dPrincipal;
  private static int[] dSecundaria;
  
  public void inicializar(int[][ ]pMatriz) {
	 
	        int aux = 1;
	        for(int i=0;i<pMatriz.length;i++){
	            for(int j=0;j<pMatriz[i].length;j++){
	                pMatriz[i][j] = aux;
	                aux++;
	            }
	        }
	    }
 public void verMatriz(int[][]pMatriz) {
	for(int i=0;i<pMatriz.length;i++){
         for(int j=0;j<pMatriz[i].length;j++){
             System.out.print("\t" + pMatriz[i][j]);
         }
         System.out.println();
     }
 }
 
 
 public void verArray(int[]pArray) {
	 for(int i=0; i<pArray.length;i++) {
		 System.out.println("\t"+ pArray[i]);
	 }
 }
 public void diagonal() {
	 for(int i=0;i<m.length;i++){
         for(int j=0;j<m[i].length;j++){
             if(i==j){
                 dPrincipal[i] = m[i][j];
             }
              
             if(i+j == m.length-1){
                 dSecundaria[i] = m[i][j];
             }
         }
     }
     System.out.println("\nDiagonal Principal");
     verArray(dPrincipal);
      
     System.out.println("\n\nDiagonal Secundaria");
     verArray(dSecundaria);
 }	 
	 
	public static void main(String[] args) {
		m=new int[3][3];
		dPrincipal=new int[m.length];
		dSecundaria=new int[m.length];
        DiagonalMatriz matriz=new DiagonalMatriz();
        matriz.inicializar(m); //se generan de forma aleatoria los elementos de la matriz
        matriz.verMatriz(m);
        matriz.diagonal();
	}