import java.util.*;

public class maxmin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number size:");
        int size=sc.nextInt();
        System.out.print("Enter number:");
        int num[]=new int[size];

        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            if(num[i]<min){
                min=num[i];
            }
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("Max vaule is:"+max);
        System.out.print("Min vaule is:"+min);

    }

    
}
