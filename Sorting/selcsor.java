import java.util.*;

public class selcsor{
    public static void main(String [] args){

        int arr[]={4,45,43,3,5,6,22,66,10};
        
        for (int i = 0; i < arr.length-1; i++) {  
            int min=i;
            for (int j = i+1; j < arr.length; j++) {  
                if (arr[min]>arr[j]){
                    min=j;
            }
            }
             int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        
    }
}