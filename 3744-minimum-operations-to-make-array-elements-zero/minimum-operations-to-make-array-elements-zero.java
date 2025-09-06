class Solution {
    public long minOperations(int[][] queries) {
        // precompute powers of 4 up to > 1e9
        long[] pow4 = new long[20];
        pow4[0] = 1L;
        for (int i = 1; i < pow4.length; i++) pow4[i] = pow4[i-1] * 4L;

        long totalOps = 0L;

        for (int[] q : queries) {
            long l = q[0];
            long r = q[1];

            long S = 0L; // sum of f(x) for x in [l, r]
            // f(x) == k for x in [4^(k-1), 4^k - 1]
            for (int k = 1; k < pow4.length; k++) {
                long segL = pow4[k-1];
                long segR = pow4[k] - 1; // inclusive
                if (segL > r) break; // no more overlap possible
                long left = Math.max(l, segL);
                long right = Math.min(r, segR);
                if (left <= right) {
                    long cnt = right - left + 1;
                    S += cnt * (long) k;
                }
            }

            long ops = (S + 1) / 2; // ceil(S/2)
            totalOps += ops;
        }

        return totalOps;
    }
}
