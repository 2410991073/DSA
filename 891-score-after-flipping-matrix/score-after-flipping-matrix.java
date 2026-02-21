class Solution {
    public int matrixScore(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            if(grid[i][0]==0){
                for(int j=0;j<n;j++){ //yeh row ko flip karta hain agar first element 0 hai toh
                    grid[i][j]^=1;
                }
            }
        }
        int score=0;
        for(int j=0;j<n;j++){
            int ones=0;
            for(int i=0;i<m;i++){
                if(grid[i][j]==1){
                    ones++;
                }
            }
            int maxones=Math.max(ones,m-ones);
            score+=maxones*(1<<(n-1-j));
        }
        return score;
    }
}