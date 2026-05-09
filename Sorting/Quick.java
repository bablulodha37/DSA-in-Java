public class Quick {
    public static int parition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;

        for (int j = low; j < high; j++) {
            if(arr[j]<pivot){
                //swap
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        // swap with pivot
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }
    public static void qsort(int arr[],int low,int high){
        if(low<high){
            int pivtidx=parition(arr, low, high);

            qsort(arr, low, pivtidx-1);
            qsort(arr, pivtidx+1, high);
        }
    }
    public static void main(String[] args) {
    int arr[]={23,5,3,76,67,343,567,23423,54,457,1};
    int n=arr.length;
    qsort(arr, 0, n-1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }  
}
