import java.util.*;

public class gcd {

    public static int grethercomdiv(int a,int b){
        int larnum=0;
        if(a<b){
            larnum=b;
        }else if(a>b){
            larnum=a;
        }else{
            larnum=b;
        }
         int large=0, bignum=0,print=0;
        for(int i=1;i<=larnum;i++){
           
            if(a%i==0){
                large=i;
            }
            if(b%i==0){
                bignum=i;
            } 
            if(large==bignum){
                print=bignum;
            }
        }
        return print;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number a:");
        int a=sc.nextInt();
        System.out.print("Enter number n:");
        int b=sc.nextInt();


        int result=grethercomdiv(a, b);
        System.out.print("GCD:"+result);
    }

}
