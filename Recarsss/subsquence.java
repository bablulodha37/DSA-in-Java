public class subsquence {

    public static void subs(int idx,String str ,String newString){
         if(idx==str.length()){
            System.out.println(newString);
            return;
         }
        char cuurent =str.charAt(idx);

        subs(idx+1, str, newString+cuurent);

        subs(idx+1, str, newString);
    }
    public static void main(String[] args) {
        subs(0, "abc", "");
    }
}
