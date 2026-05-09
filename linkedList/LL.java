public class LL {

    Node head;
    int size;   // declare size here

    LL(){
        size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // add first
    public void addfirst(String data) {
        Node newn = new Node(data);

        if (head == null) {
            head = newn;
        } else {
            newn.next = head;
            head = newn;
        }
        size++;   // increment here
    }

    // add last
    public void addlast(String data) {
        Node newl = new Node(data);

        if (head == null) {
            head = newl;
        } else {
            Node currnode = head;
            while (currnode.next != null) {
                currnode = currnode.next;
            }
            currnode.next = newl;
        }
        size++;
    }

    // delete first
    public void delfirst(){
        if(head == null){
            System.out.println("empty ll");
            return;
        }
        head = head.next;
        size--;
    }

    // delete last
    public void dellast(){
        if(head == null){
            System.out.println("empty ll");
            return;
        }

        if(head.next == null){   // single node case
            head = null;
            size--;
            return;
        }

        Node secondlast = head;
        Node lastnode = head.next;

        while(lastnode.next != null){
            secondlast = lastnode;
            lastnode = lastnode.next;
        }

        secondlast.next = null;
        size--;
    }

    public int getsize(){
        return size;
    }

    // print
    public void printlist () {
        if(head == null){
            System.out.println("empty ll");
            return;
        }

        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + " -> ");
            currnode = currnode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addfirst("a");
        list.addfirst("is");
        list.addfirst("this");
        list.addlast("list");
        list.delfirst();
        list.dellast();
        list.printlist();
        System.out.println("\nSize: " + list.getsize());
    }
}