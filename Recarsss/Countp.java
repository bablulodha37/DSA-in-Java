public class Countp {
    public static int countpath(int i, int j,int m,int n) {
        if(i==n-1 && j==m-1){
            return 1;
        }
        if (i >= n || j >= m) {
            return 0;
        }
        int right=countpath(i+1, j, m, n);

        int down=countpath(i, j+1, m, n);

        return right+down;
    }
    public static void main(String[] args) {

       int n= countpath(0, 0,3 , 3);
       System.out.println(n);
    }
}
