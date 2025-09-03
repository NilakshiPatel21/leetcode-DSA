
class Solution {
    public int numberOfPairs(int[][] points) {
        // Sort: x ascending, if tie then y descending
        Arrays.sort(points, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return b[1] - a[1];
        });

        int n = points.length;
        int ans = 0;

        // Alice at i
        for (int i = 0; i < n; i++) {
            int topY = points[i][1];
            int botY = Integer.MIN_VALUE;

            // Bob at j > i
            for (int j = i + 1; j < n; j++) {
                int yj = points[j][1];
                if (topY >= yj && yj > botY) {
                    ans++;
                    botY = yj;
                }
            }
        }
        return ans;
    }
}

