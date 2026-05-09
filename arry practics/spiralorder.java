import java.util.*;

public class spiralorder {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of row:");
        int n=sc.nextInt();
        System.out.print("Enter number of colum:");
        int m=sc.nextInt();

        int [][] arr=new int[n][m];

        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
              arr[i][j]=sc.nextInt();
            }
        }

         for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //spiral order
        System.out.println("Spiral order:");
        int row_start=0,row_end=n-1;
        int column_start=0,column_end=m-1;

         while(row_start <= row_end && column_start <= column_end) {
            
            for (int i = column_start; i <=column_end; i++) {
                System.out.print(arr[row_start][i]+" ");
            }
             row_start++;

            for (int i = row_start; i <= row_end; i++) {
                System.out.print(arr[i][column_end]+" ");
            }
            column_end--;
 
            for (int i = column_end; i >= column_start; i--) {
                System.out.print(arr[row_end][i]+" ");
            }
            row_end--;
            for (int i = row_end; i >= row_start; i--) {
                System.out.print(arr[i][column_start]+" ");
            }
            column_start++;
         }
    }
    
}
