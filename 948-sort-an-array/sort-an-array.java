class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        divide( nums , 0 , n-1);
        return nums;
    }

    public static void divide(int[] arr , int l , int r ){

        if( l >= r) return;
        int mid = l + (r-l) / 2;
        divide( arr , l , mid);
        divide(arr , mid+1 , r);

        merge(arr , l , mid , r);
    }

    public static void merge( int[] arr , int l , int mid, int r){

        int n1 = mid - l+1;
        int n2 = r - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        // copy
        for(int i =0 ; i< n1; i++){
            left[i] = arr[l+i];
        }
        for(int j =0 ; j< n2; j++){
            right[j] = arr[mid+1+j];
        }

        int i =0 , j=0, k=l;
        while( i < n1 && j <n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            } else{
                arr[k] = right[j];
                j++;
            }
            k++;
    }
    while(i < n1){
        arr[k ] = left[i];
        i++;
        k++;
    }
     while(j < n2){
        arr[k ] = right[j];
        j++;
        k++;
    }
}
}