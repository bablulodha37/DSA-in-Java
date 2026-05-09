import java.util.ArrayList;

public class LLarray {

    static class InnerLLarray {

        static ArrayList<Integer>list=new ArrayList<>();

        //empty
        public static boolean isempty(){
                return list.size()==0;
        }
        // push
        public static  void pushs(int data){
            list.add(data);
        }

        //pop
        public static int pops(){
                if(isempty()){
                    return -1;
                }
                int top=list.get(list.size()-1);
                list.remove(list.size()-1);
                return top;
        }

        //peek

        public static int peek(){
            if(isempty()){
                    return -1;
                }
                return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        InnerLLarray.pushs(2);
        InnerLLarray.pushs(3);
        InnerLLarray.pushs(4);
        InnerLLarray.pushs(5);
        InnerLLarray.pushs(8);

        while (!InnerLLarray.isempty()) {
            System.out.println(InnerLLarray.peek());
            InnerLLarray.pops();
        }

    }
}
