class Hash {
    static int a=100;
    int b;
   
    Hash(){
        b=a;
        a++;
    }
   
    @Override
    public int hashCode(){
        return b;
    }
    public static void main(String args[]){
        Hash s = new Hash();
        System.out.println(s);
        System.out.println(s.toString());
    }
}