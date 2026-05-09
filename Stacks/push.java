public class push {

    static class Node{
        int data;
        Node next;
       public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class stackll{
        public static Node head;

        public static boolean isempty(){
            return head==null;
        }

       public  static void pushs(int data){ // push
        Node newnode=new Node(data);
            if(isempty()){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
        public  static int pops(){// pop
             if(isempty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
public  static int peeks(){// peek
if(isempty()){
                return -1;
            }
             return head.data;
        }

    }
    public static void main(String[] args) {
       // Stack s=new Stack<>();

        stackll.pushs(2);
        stackll.pushs(3);
        stackll.pushs(4);
        stackll.pushs(5);
        stackll.pushs(8);

        while (!stackll.isempty()) {
            System.out.println(stackll.peeks());
            stackll.pops();
        }
    }
}
