import java.util.*;

public class RotateArray {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size:");
        int n=sc.nextInt();

        int []arr=new int[n];
        System.out.print("Enter array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        // rotate array

        System.out.print("Enetr number for rotate:");
        int k=sc.nextInt();
        int j=arr.length-k;

        for (int i = 0; i < arr.length; i++) {
            if(k>0){
                System.out.print(arr[arr.length-k]+" ");
                k--;
            }
        }
        for (int i = 0; i < j; i++) {
             System.out.print(arr[i]+" ");
        }
        }
}
