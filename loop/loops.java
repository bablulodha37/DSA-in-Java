 import java.util.*;
public class loops {
    public static void main (String[] args){

        // for(int i=1;i<=10;i++){
        //     int j=2*i;
        //     System.out.println(j+" ");
        // }


        // int j,i=0;
        // while(i<=10){
        //     j=2*i;
        //     System.out.println(j);
        //     i++;
        // }


        // int j,i=0;
        // do{
        //     j=2*i;
        //      System.out.println(j);
        //      i++;
        // }while(i<=10);


        Scanner sc = new Scanner(System.in);
        // System.out.print("Enetr number:");
        // int num=sc.nextInt();
        // int sum=0;
        // for(int i=0;i<=num;i++){
        //     sum+=i;
        // }
        // System.out.println("sum of number = "+sum);


        System.out.print("Enetr number:");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            int j=n*i;
            System.out.println(j);
         }
    }
    
}
