public class quearr {

    static int rear;
    static int arr[];
    static int size;

    quearr(int n) {
        rear = -1;
        size = n;
        arr = new int[size];
    }

    public static boolean isEmpty() {
        return rear == -1;
    }

    public static boolean isFull() {
        return rear == size - 1;
    }

    // add
    public static void add(int data) {
        if (isFull()) {
            System.out.println("full queue");
            return;
        }
        arr[++rear] = data;
    }

    // remove
    public static int remove() {
        if (isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }

        int front = arr[0];

        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;

        return front;
    }

    // peek
    public static int peek() {
        if (isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }

        return arr[0];
    }

    public static void main(String[] args) {
        quearr q = new quearr(5);

        add(1);
        add(2);
        add(3);

        System.out.println(remove());
        System.out.println(peek());
        
    }
}