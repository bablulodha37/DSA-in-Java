import java.util.*;

public class arr2d {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter number of colums: ");
        int colums=sc.nextInt();


        int arrs2d [][]=new int[rows][colums];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                arrs2d[i][j]=sc.nextInt();
            }
        }
         
        // System.out.println("Print metrix:");
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < colums; j++) {

        //        System.out.print(arrs2d[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        System.out.print("Enter element x:");
        int x=sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                if(x==arrs2d[i][j]){
                    System.out.println("Element is find:"+arrs2d[i][j]);
                    System.out.println(" "+i+" "+j+" ");
                }
            }
    
        }
        

    }
}