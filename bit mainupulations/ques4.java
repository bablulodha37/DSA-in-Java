
public class ques4 {
    
    public static void main(String[] args) {
        //decimal to binary
    //     int n=13; //0101
    //     String binary="";
    //     while (n>0){
    //         int bin=n&1;
    //          binary+=bin;
    //          n=n>>1;
    //     }
    //    System.out.print(binary);

    
        int n=0b101; //5
        int sum=0;
        int power=0;
       
        do {
            int ans=n&1;
            int mul=1<<power;
            power ++;
            int result =ans*mul;
           sum+=result;
        
             n=n>>1;
        }while (n>0);
        System.out.print(sum);
    }
}