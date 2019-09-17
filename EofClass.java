
public class EofClass { //con cada enter registra el EOF y lo imprime numerado
 
	public static void main(String[] args) {
      Scanner  obScanner= new Scanner(System.in);
       int j=1;
        while(obScanner.hasNextLine()) {//verdadero si existe otra línea
        	System.out.println(j+ ""+ obScanner.nextLine()); //busca al salto de línea
        	j++;
        }
      obScanner.close();
   }
}