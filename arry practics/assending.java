import java.util.*;

public class assending {

     public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size:");
        int size =sc.nextInt();
        System.out.print("Enter array:");
        int arr[]=new int [size];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();    
        }
        
        boolean isAssendig=true;
        
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                isAssendig=false;
                break;
            }
        }
        
        if (isAssendig) {
            System.out.print("array is sorted");
        }
        else{
            System.out.print("array is not sorted");
        }
        sc.close();
    }
}
