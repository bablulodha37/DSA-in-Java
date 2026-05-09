import java.util.*;
public class searcharr {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of your array:");
        int size=sc.nextInt();

        int num[]=new int[size];
        System.out.print("Input your array:");
        for(int i=0;i<size;i++){
            num [i]=sc.nextInt();
        }
        System.out.print("Enter number for find:");
        int x=sc.nextInt();
        for(int i=0;i<num.length;i++){
           if(num[i]==x){
            System.out.print("number found index:"+i);
           }
        }
    }
}
