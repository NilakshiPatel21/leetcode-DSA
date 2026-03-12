class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        
        if(n==0) return 1;

        int result = 10;
        int uniquedigits = 9;
        int available = 9;

        for(int i =2 ; i<= n && available > 0 ; i++){
            uniquedigits = uniquedigits * available;
            result += uniquedigits;
            available --;
        }
        return result;
    }
}