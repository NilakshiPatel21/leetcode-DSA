class Solution {
    public int binaryGap(int n) {
        int last = -1;
        int curr = 0;
        int maxD = 0;

        while(n>0){
            if((n&1) == 1){
                if( last != -1){
                    maxD = Math.max(maxD, curr-last);
                }
                last = curr;
            }
            n = n>> 1;
            curr++;
        }
        return maxD;
    }
}