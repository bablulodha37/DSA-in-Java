
public class keypadcombi {
    public static String keypad[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public  static void keycom(String str,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
         }
        char currech=str.charAt(idx);
        String mapping=keypad[currech-'0'];
        
        for(int i=0;i<mapping.length();i++){
            keycom(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        keycom("23", 0, "");
    }
}