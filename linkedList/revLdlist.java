public class revLdlist {

    Node head;

    class Node{
        Integer data;
        Node next;

        Node(Integer data){
            this.data=data;
            this.next=null;
        }
    }

    // add last
    public void addlast(Integer data) {
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
    }

    // reverse linked list
    public void rev(){
        if(head==null || head.next==null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;
    }

    // print list
    public void printList(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        revLdlist Ldlist = new revLdlist();

        Ldlist.addlast(1);
        Ldlist.addlast(2);
        Ldlist.addlast(3);
        Ldlist.addlast(4);

        Ldlist.printList();

        Ldlist.rev();

        Ldlist.printList();
    }
}
