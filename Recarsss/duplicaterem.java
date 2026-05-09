public class duplicaterem {
    public static boolean [] map=new boolean[26];
    public static void dupremo(String str,int idx,String newString) {
       if(idx==str.length()){
            System.out.print(newString);
            return;
        }
        char cuurent=str.charAt(idx);
        if(map[cuurent-'a']){
            dupremo(str, idx+1,newString);
        }else{
            newString+=cuurent;
            map[cuurent-'a']=true;
            dupremo(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        dupremo("abbccda", 0, "");
    }
}
