
public class setbit {
   
    public static void main(String[] args) {
        int n=4; //0101
        int pos=1;
        int Bitmask=1<<pos;
        int op=Bitmask |n;
       System.out.println(op);
    }
}