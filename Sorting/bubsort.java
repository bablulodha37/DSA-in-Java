import java.util.*;

public class bubsort {
    public static void main(String [] args){

        int arr[]={4,45,43,3,5,6,22,66,10};
        
        for (int i = 0; i < arr.length-1; i++) {  //n-1
            for (int j = 0; j < arr.length-i-1; j++) {  
                if (arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            }
            
        }
        System.out.println(Arrays.toString(arr));
        
    }
}