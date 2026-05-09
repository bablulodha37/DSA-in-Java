public class fab{

    public static void fano(int f,int s,int n){

        if(n==0){
            return;
        }
        int sum=f+s;
        System.out.println(sum);
         fano(s, f+s, n-1);
        
    }
   
    public static void main(String args[]){
        int f=0,s=1,n=7;
        System.out.println(0);
       System.out.println(1);
       fano(f, s, n-2);
       
    }
}