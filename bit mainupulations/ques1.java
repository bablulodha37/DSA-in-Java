
public class ques1 {
    public static void main(String[] args) {
        int n=5; //0101
        int bit=n&(n-1);

        if(bit==0){
            System.out.print("number is power of 2");
        }else{
             System.out.print("number is not power of 2");
        }
       
    }
}
