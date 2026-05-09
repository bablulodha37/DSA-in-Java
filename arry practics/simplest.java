import java.util.Arrays;
import java.util.Scanner;

public class simplest {
 
    public static void main(String[] args) {
        //int[] marks=new int[20];
        // int marks[]=new int[20];
        
        // marks[0]=23;
        // marks[1]=62;
        // marks[2]=30;
        // marks[3]=624; 
        // marks[4]=242;
        // marks[5]=203; 
        // marks[6]=230;
        

        //int marks[]={23,62,30,624,242,203,230};

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);
        // System.out.println(marks[5]);
        // System.out.println(marks[6]);

        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        
        int marks[]=new int[size];

        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        // for(int i=0;i<size;i++){
        //     System.out.print(marks[i]);
        // }
        for (int num:marks) {
            System.out.println(num);
        }
        System.out.println(Arrays.toString(marks));
        
    }
   
}