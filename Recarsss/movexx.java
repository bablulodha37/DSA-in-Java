public class movexx {
    public static int count =0;
    public static void lastxx(String str,int idx){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                 System.out.print("x");
            }
            return;
        }
        if(str.charAt(idx)!='x'){
            System.out.print(str.charAt(idx));
        }else{
            count++;
        }
        lastxx(str, idx+1);
    }
    public static void main(String[] args) {
       lastxx("axbcxxd", 0);
    }
}
