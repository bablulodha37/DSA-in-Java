import java.util.*;

public class raisedpower {
    public static int power(int x,int n){
        int raise=x;
        for(int i=1;i<n;i++){
            raise*=x;
        }
        return raise;
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number x:");
        int x=sc.nextInt();
        System.out.print("Enter number n for power x:");
        int n=sc.nextInt();

        int result=power(x,n);
        System.out.print("The value of one number raised to the power of another: "+result);
    }
    
}
