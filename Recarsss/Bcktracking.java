public class Bcktracking {
    public static void Findbacktrack(String str ,String parmutation){
        if(str.length()==0){
            System.out.println(parmutation);
            return;
        }
        for (int i = 0; i <str.length(); i++) {
            char current=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);

            Findbacktrack(newstr, parmutation+current);
        }
    }
    public static void main(String[] args) {
        Findbacktrack("abc", "");
    }
}
