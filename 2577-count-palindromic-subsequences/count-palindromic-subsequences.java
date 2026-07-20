class Solution {
    public int countPalindromes(String s) {

        int MOD = 1000000007;
        int n = s.length();

        long[][] leftPairs = new long[10][10];
        long[][] rightPairs = new long[10][10];

        long[] leftFreq = new long[10];
        long[] rightFreq = new long[10];

        // Build rightPairs
        for (int i = n - 1; i >= 0; i--) {
            int d = s.charAt(i) - '0';

            for (int x = 0; x < 10; x++) {
                rightPairs[d][x] += rightFreq[x];
            }

            rightFreq[d]++;
        }

        long ans = 0;

        for (int mid = 0; mid < n; mid++) {

            int d = s.charAt(mid) - '0';

            // Remove current digit from right
            rightFreq[d]--;

            for (int x = 0; x < 10; x++) {
                rightPairs[d][x] -= rightFreq[x];
            }

            // Count all palindromes
            for (int a = 0; a < 10; a++) {
                for (int b = 0; b < 10; b++) {
                    ans = (ans + leftPairs[a][b] * rightPairs[b][a]) % MOD;
                }
            }

            // Update left pairs
            for (int x = 0; x < 10; x++) {
                leftPairs[x][d] += leftFreq[x];
            }

            leftFreq[d]++;
        }

        return (int) ans;
    }
}