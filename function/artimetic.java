import java.util.*;
public class artimetic{

    public static int Multi(int a, int b){
        //int jod=a*b;
        return a*b;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Entar number a: ");
        int a=sc.nextInt();
        System.out.print("Entar number b: ");
        int b=sc.nextInt();

       int product= Multi(a,b);// calling
       System.out.println("product of number:"+product);
        
    }
    
}
