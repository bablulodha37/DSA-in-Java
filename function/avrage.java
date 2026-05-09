import java.util.*;

public class avrage {

    public static int calculateavrage(int a, int b, int c){
        int sum=a+b+c;
        int av=sum/3;
        return av;
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number a:");
        int a=sc.nextInt();
        System.out.print("Enter number b:");
        int b=sc.nextInt();
        System.out.print("Enter number c:");
        int c=sc.nextInt();

        int result=calculateavrage(a, b, c);
        System.out.println("number of avarage:"+result);
    }
    
}
