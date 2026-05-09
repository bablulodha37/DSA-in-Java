
public class ques3 {
    public static void main(String[] args) {
        int n=5; //0101
        int count=0;
        do {
            int ans=n&1;
            if(ans==1){
                count++;
            } 
             n=n>>1;
        }while (n>0);
        System.out.print(count);
    }
}
