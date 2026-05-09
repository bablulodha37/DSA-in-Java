import java.util.*;
public class pattern {

    public static void main(String [] args){
        Scanner ba=new Scanner(System.in);
        System.out.print("Enetr number of pattern  :");
        int n =ba.nextInt();
        // System.out.print("Enetr number of coloum  :");
        // int m =ba.nextInt();

        //solid pattern
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //     System.out.print("*");
        // } System.out.println();
        // }


        // hollow pattern
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //     if(i==1 || j==1 || i==n || j==m){
        //         System.out.print("*");
        //     }else { System.out.print(" ");}
        // } System.out.println();
        // }


        // hafpyramid pattern
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //          System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //inverted hafpyramid pattern
        // for(int i=0;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //          System.out.print("*");
        //     }
        //     System.out.println();
        // }


         //inverted hafpyramid pattern roted by 180.
        // for(int i=1;i<=n;i++){

        //    for(int j=n;j>=i;j--){
        //     System.out.print(" ");
        //    }
        //    for(int j=1;j<=i;j++){
        //     System.out.print("*");
        //    }
        //     System.out.println();
        // }


         // hafpyramid pattern witn number
        // for(int i=1;i<=n;i++){

        //     for(int j=1;j<=i;j++){
        //          System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        //  inverted hafpyramid pattern witn number
        // for(int i=0;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //          System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }



        //floyd's triagle
        // int k=1;
        // for(int i=1;i<=n;i++){
        
        //     for(int j=1;j<=i;j++){
        //         System.out.print(k+" ");
        //         k++;

        //     }
        //    
        // }


        //0-1 traingle
        // for(int i=1; i<=n;i++){
           
        //     for(int j=1;j<=i;j++){
        //         int sum=i+j;
        //          if(sum%2==0){
        //             System.out.print("1");
        //          }else{ 
        //             System.out.print("0");
        //          }
        //     }
        //      System.out.println();
        // }

        
        // butterfly pettern 

        // for (int i=1;i<=n;i++){

        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     int space=2*(n-i);
        //      for(int j=1;j<=space;j++){
        //         System.out.print(" ");
        //      }
        //      for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }      
        //   System.out.println();
        // } 
        //  for (int i=n;i>=1;i--){

        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     int space=2*(n-i);
        //      for(int j=1;j<=space;j++){
        //         System.out.print(" ");
        //      }
        //      for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }      
        //   System.out.println();
        // } 


        // hol peramid
         
        // for(int i=1;i<n;i++){
        //    int num=1;
        //     for(int j=1;j<n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<i;j++){
        //         System.out.print(num);
        //         num++;
        //     }
        //    for (int j=i-2; j>= 1;j--) {
        //         System.out.print(j);
        //     }

        //     System.out.println();
        // }


        // butter fuky pettren 
        //uper pettren
        // for(int i=1;i<=n;i++){

        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     int space=2*(n-i)-1;
        //     for(int j=1;j<=space;j++){
        //          System.out.print(" ");
               
        //     }
        //      for(int j=1;j<=i;j++){
        //         if(j<n){
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }
        // //lower pattern
        //  for(int i=n-1;i>=1;i--){

        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     int space=2*(n-i)-1;
        //     for(int j=1;j<=space;j++){
        //          System.out.print(" ");
               
        //     }
        //      for(int j=1;j<=i;j++){
        //         if(j<n){
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

        // solid rombus
        // for(int i=1;i<=n;i++){

        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //number peramid
        // int num=1;
        // for(int i=1;i<=n;i++){

        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
            
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num+" ");
        //     }
        //     num++;
        //     System.out.println();
        // }

        //palindromic pattern

        // for(int i=1;i<=n;i++){

        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     for(int j=2;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        ///daimand
        
        
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i=n;i>=1;i--){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
