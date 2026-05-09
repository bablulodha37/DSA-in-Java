import java.util.*;

public class factoriel {

    public static int Factorial(int n){
        if (n<0){
            System.out.println("input invalid number");
            return -1;
        }else{
             int facto=1;
        for(int i=n;i>=1;i--){
            facto=facto*i;
        }
         return facto;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number for factorial:");
        int n=sc.nextInt();

       int result = Factorial(n);
        if (result != -1) {
            System.out.println("Factorial: " + result);
        }

    }
}