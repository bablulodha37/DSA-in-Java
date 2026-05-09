public class occrence {
        public static int first=-1;
        public static int last=-1;
    public static void occe(String str,int idx,char element) {
        if(idx==str.length()){
            System.out.print("first idx "+first+" last idx "+last);
            return;
        }
        char cuurent=str.charAt(idx);
        if(cuurent==element){
            if(first==-1){
                first=idx;
            }else{
            last=idx;
        }
        }
        occe(str, idx+1, element);
    }
    public static void main(String[] args) {
        occe("babcbaaabcahhh", 0, 'a');
    }
}
