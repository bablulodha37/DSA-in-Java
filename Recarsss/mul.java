import java.util.*;

public class mul {
    public static int multi(int x, int n) {
        if (n == 0) {
            return 1; // base case: x^0 = 1
        }
        if (x == 0) {
            return 0; // base case: 0^n = 0 (n > 0)
        }
        // int mulp = multi(x, n - 1);
        // int result = x * mulp;
        // return result;

        // second type for remove compexity
        if(n%2==0){
            return multi(x,n/2)*multi(x,n/2);
        }else{
            return multi(x,n/2)*multi(x,n/2)*x;
        }
    }

    public static void main(String args[]) {
        int x = 2, n = 5;
        int ans = multi(x, n);
        System.out.print(ans); // should print 8 (2^3)
    }
}
