public class Placetiles {
    public static int countTotal(int n, int m) {
        if (n < m) {
            return 1;
        }
        if (n == m) {
            return 2;
        }
        int vertical = countTotal(n - 1, m);
        int horizontal = countTotal(n - m, m);

        return vertical + horizontal;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        int result = countTotal(n, m);
        System.out.println(result);
    }
}
