import java.util.*;

public class sumnatural {

    public static void sums(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sums(i+1,n,sum);
        System.out.println(i);
    }
    public static void main(String[] args) {
       sums(1, 5, 0);
    }
}
