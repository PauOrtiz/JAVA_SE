package sentencias;

public class SentenciaWhile { //cuadrado
	private  int i=0;

    public void mientras() {
    while(i<=12){
	System.out.println("****");
	i++;
       }
    }
    
	public static void main(String[] args) {
        SentenciaWhile operacion=new SentenciaWhile();
        operacion.mientras();
    }
}