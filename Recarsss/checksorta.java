public class checksorta {

    public static boolean checksortarr(int [] arr,int idx){
        if(idx==arr.length-1){
            return true;
        }
       if(arr[idx]>=arr[idx+1] ){
        return false;
       }
      return checksortarr(arr, idx+1);
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,5};// false
      System.out.println(checksortarr(arr, 0));
    }
    
}
