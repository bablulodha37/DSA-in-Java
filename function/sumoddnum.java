import java.util.*;

public class sumoddnum {

    public static int sumodd(int n){
        int add=0;
        for(int i=1;i<=n;i++){
            
            if (i%2==0){
                add+=i;
            }
        }
        return add;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number for odd addition:");
        int n=sc.nextInt();

        int result=sumodd(n);
        System.out.println("sum of add number:"+result);

    }
    
}
