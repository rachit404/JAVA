package DSA.Sorting;

class MergeSort {
    static int[] temp;
    public static void merge(int arr[], int low, int mid, int high){
        int k = low; // pointer for temp
        int left = low;
        int right = mid+1;
        while(left <= mid && right <= high){

            if(arr[left] <= arr[right])
                temp[k++] = arr[left++];
            else
                temp[k++] = arr[right++];
            
        }
        while(left <= mid)
            temp[k++] = arr[left++];
        while(right <= high)
            temp[k++] = arr[right++];

        //? Copy sorted values in original array
        // for(int j=low; j<=high ;j++)
        //      arr[j] = temp[j];
        // !OR
        System.arraycopy(temp, low, arr, low, high-low+1);
    }
    public static void mergeSort(int arr[], int low, int high){
        if(low >= high) 
            return;
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    public static void main(String[] args) {
        int arr[] = {80, 90, 55, 2, 10, 100};
        temp = new int[arr.length];
        mergeSort(arr, 0, arr.length-1);
        for(int i: arr)
            System.out.print(i+" ");
    }
}