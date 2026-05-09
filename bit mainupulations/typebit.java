
public class typebit {
    
   
    public static void main(String[] args) {
        int n=5; //0101
        int pos=1;
        int opre=1;// update bit for 1  if opre 1 and opre 0 then 0
        //clear bit
    //     int Bitmask=1<<pos;
    //     int notbitmask=~(Bitmask);

    //     int op=notbitmask&n;
    //    System.out.println(op);

        //update bit****
        int Bitmask=1<<pos;
       if (opre==0){
       
        int notbitmask=~(Bitmask);
        int op=notbitmask&n;
       System.out.println(op);
       }else{
        int op=Bitmask |n;
       System.out.println(op);
       }

    }
}