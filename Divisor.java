public class Divisor {
   
    boolean esDivisor(int a, int b){
        if ((b%a)==0) {
        	return true;
        }
        else {
        	return false;
        }
    }

    public static void main(String[] args) {
        Divisor x =new Divisor();
        if (x.esDivisor(3,20)) System.out.println("3 no es Divisor de 20");
        if (x.esDivisor(10,20)) System.out.println("10 es Divisor de 20");
    }
}