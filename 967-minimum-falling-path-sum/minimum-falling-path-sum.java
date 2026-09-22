
class Solution {
    public int minFallingPathSum(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int[][]dp=new int[m][n];
        for(int j = 0; j < n; j++) {
            dp[0][j] = matrix[0][j];
        }

        for(int i = 1; i < m; i++) {
            for(int j = 0; j < n; j++) {

                int min = dp[i-1][j];

                if(j > 0) {
                    min = Math.min(min, dp[i-1][j-1]);
                }

                if(j < n-1) {
                    min = Math.min(min, dp[i-1][j+1]);
                }

                dp[i][j] = matrix[i][j] + min;
            }
        }

        int ans = dp[m-1][0];

        for(int j = 1; j < n; j++) {
            ans = Math.min(ans, dp[m-1][j]);
        }

        return ans;
    }
}

