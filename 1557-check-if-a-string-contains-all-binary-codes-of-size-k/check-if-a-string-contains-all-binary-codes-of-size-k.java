class Solution {
    public boolean hasAllCodes(String s, int k) {

        // If string is too small, impossible
        if (s.length() < k) return false;

        int total = 1 << k;   // total possible binary codes (2^k)
        boolean[] seen = new boolean[total];

        int mask = total - 1;
        int num = 0;          
        int count = 0;        

        for (int i = 0; i < s.length(); i++) {

            int currentBit = s.charAt(i) - '0';
            num = ((num << 1) & mask) | currentBit;
        
            if (i >= k - 1) {

                if (!seen[num]) {
                    seen[num] = true;
                    count++;
                }
                if (count == total)  return true;
            }
        }

        return false;
    }
}