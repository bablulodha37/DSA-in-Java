 public class PrintNumb {

//     public static void printnum(int n){
//         if(n==0){
//             return;
//         }

//        // System.out.println(n);
        
//         printnum(n-1);
//          System.out.println(n);
//     }
//     public static void main(String[] args) {
//         int n=5;
//          printnum(n);
//     }
 



//********************** N nature number *****************************/

    public static int naturesum(int n,int m){
       
        if(n==6){
            return  m+n;
        }
        
      return naturesum(n+1, m+n); 
    }

    public static void main(String[] args) {
      int k= naturesum(1, 0);
       System.out.println(k);

    }
 }