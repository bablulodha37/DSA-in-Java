public class fac {

    public static int fact(int n,int store){
        
        if(n<=0){
            return store;
        }
       
        return fact(n-1, store*n);
    }

    public static void main(String[] args) {
       System.out.println(fact(0, 1));

    }
}
