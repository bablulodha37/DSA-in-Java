public class towerhanoi {

    public static void tower(int n, String src, String help, String des) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + src + " to " + des);
            return;
        }
        tower(n - 1, src, des, help);  // Move n-1 disks to helper
        System.out.println("Move disk " + n + " from " + src + " to " + des); // Move nth disk to destination
        tower(n - 1, help, src, des);  // Move n-1 disks from helper to destination
    }

    public static void main(String[] args) {
        tower(3, "S", "H", "D");
    }
}
