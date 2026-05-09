public class Powermul {
    
    // //stack height == n
    // public static int powermulti(int n, int x, int mul) {
    //     if (n == 0) {
    //         return mul; 
    //     }
    //     return powermulti(n - 1, x, mul * x);
    // }


    //*********************stack height == logn */


    public static int Powerlog(int n,int x){

        if(n==0){
            return 1;
        }
        int half=Powerlog(n/2, x);
        //if n is even
        if(n%2==0){
            return half*half;
        }else{//if n is odd
            return half*half*x;
        }
    }

    public static void main(String[] args) {
        System.out.println(Powerlog(5, 2)); // 32
    }
}
