class Solution {
    public int[] sortByBits(int[] arr) {

        int n = arr.length;

        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                int bit1 = countBits(arr[j]);
                int bit2 = countBits(arr[j + 1]);

                if (bit1 > bit2 || 
                   (bit1 == bit2 && arr[j] > arr[j + 1])) {

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

     // Efficient bit counting using n & (n - 1)
    public int countBits(int n) {
        int count = 0;

        while (n > 0) {
            n = n & (n - 1);  // removes last set bit
            count++;
        }

        return count;
    }
}
    