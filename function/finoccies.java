import java.util.*;

public class finoccies {
   public static void fibnocci(int n){
        int sum=0,num=1,next;

        if(1<=n){
            System.out.print(sum+" ");
        }
        if(2<=n){
            System.out.print(num+" ");
        }
        for(int i=3;i<=n;i++){
           next = sum + num;
            System.out.print(next+" ");
            sum = num;
            num = next;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr n number:");
        int n=sc.nextInt();
       fibnocci(n);
    }
    
}
