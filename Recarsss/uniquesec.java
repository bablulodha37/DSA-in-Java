import java.util.HashSet;
public class uniquesec {
  
    public static void subs(int idx,String str ,String newString,HashSet<String>set){
         if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }else{
                set.add(newString);
                 System.out.println(newString);
            return;
            }
         }
        char cuurent =str.charAt(idx);

        subs(idx+1, str, newString+cuurent,set);

        subs(idx+1, str, newString,set);
    }
    public static void main(String[] args) {
        HashSet<String>set=new HashSet<>();
        subs(0, "aaa", "",set);
    }
}