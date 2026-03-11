class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int r = 0;

        while(temp > 0){
            int digit = temp % 10;
            r = r*10 + digit;
            temp /= 10;
        }
        return x == r;
    }
}