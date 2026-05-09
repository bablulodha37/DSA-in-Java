
public class ques2 {
    public static void main(String[] args) {
        int n=5; // 0101
        int pos=2;
        int bitmask=1<<pos;

        int result=n^bitmask;
        System.out.print("toggle:"+result);
    }
}
