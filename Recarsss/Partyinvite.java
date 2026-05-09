public class Partyinvite {
    public static int countTotal(int n) {
        if (n <= 1) {
            return 1;
        }
        int single = countTotal(n - 1);
        int pairs = (n-1)*countTotal(n -2);

        return single+pairs;
    }

    public static void main(String[] args) {
        int n = 4;
        int result = countTotal(n);
        System.out.println(result);
    }
}
