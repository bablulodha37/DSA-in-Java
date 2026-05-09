import java.util.*;

public class twogrether {
    
    public static void grether(int a,int b){
        if(a<b){
            System.out.print("grether number is:"+b);
        }else if(a>b){
            System.out.print("grether number is:"+a);
        }else{
            System.out.print(" number is equal");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number a:");
        int a=sc.nextInt();
        System.out.print("Enter number b:");
        int b=sc.nextInt();
        grether(a, b);

    }
}
