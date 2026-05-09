public class Rec {
 
    public static void  rec3(String str,String premutation){
         if(str.length()==0){
            System.out.println(premutation);
            return;
         }
         for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);

            rec3(newstr, premutation+current);
         }
    }
    public static void main(String[] args) {
       rec3("abc", "");
    }
}
