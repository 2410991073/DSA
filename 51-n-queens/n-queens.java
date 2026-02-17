class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ans=new ArrayList<>();
        int[][] board=new int[n][n];
        solve(0,ans,board,n);
        return ans;
    }
    boolean isSafe(int row,int col,int [][] board,int n){
        int x=row,y=col;
        while(y>=0){
            if(board[x][y]==1) return false;
            y--;
        }
        x=row;
        y=col;
        while(x>=0 && y>=0){
            if(board[x][y]==1) return false;
            y--;
            x--;
        }
       x=row;
       y=col;
        while(x<n && y>=0){
            if(board[x][y]==1) return false;
            y--;
            x++;
        }
        return true;
    }
    void solve(int col,List<List<String>>ans,int[][] board,int n){
        if(col==n){
            addSol(ans,board,n);
            return ;
        }
        for(int row=0;row<n;row++){
            if(isSafe(row,col,board,n)){
                board[row][col]=1;
                solve(col+1,ans,board,n);
                board[row][col]=0;
            }
        }
    }
    void addSol(List<List<String>>ans,int[][] board,int n){
        List<String>temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            String row="";
            for(int j=0;j<n;j++){
                if(board[i][j]==1)
                    row+="Q";
                    else
                    row+=".";
                }
                temp.add(row);
            }
            ans.add(temp);
    }
}
    //     List<List<String>>ans=new ArrayList<>();
    //     int [][] board=new int[n][n];
    //     solve(0,ans,board,n);
    //     return ans;
    // }
    // boolean isSafe(int row,int col,int[][]board,int n){
    //     int x=row;
    //     int y=col;
    //     while(y>=0){  //used for same row
    //     if(board[x][y]==1) return false;
    //         y--;
    //     }
    //     x=row;
    //     y=col;
    //     //check for diagonal
    //     while(x>=0 && y>=0){
    //         if(board[x][y]==1) return false;
    //         y--;
    //         x--;
    //     }
    //     x=row;
    //     y=col;
    //     //check for diagonal
    //     while(x<n && y>=0){
    //         if(board[x][y]==1) return false;
    //         y--;
    //         x++;
    //     }
    //     return true;
    // }
    // void solve(int col,List<List<String>>ans,int[][]board,int n){
    //     //base case
    //     if(col==n){
    //         addSol(ans,board,n);
    //         return ;
    //     }
    //     //solve 1 case
    //     for(int row=0;row<n;row++){
    //         if(isSafe(row,col,board,n)){
    //             board[row][col]=1;
    //             solve(col+1,ans,board,n);
    //             board[row][col]=0;
    //         }
    //     }
    // }
    // void addSol(List<List<String>>ans,int[][]board,int n){
    //     List<String>temp=new ArrayList<>();
    //     for(int i=0;i<n;i++){
    //         String row="";
    //         for(int j=0;j<n;j++){
    //             if(board[i][j]==1)
    //             row+="Q";
    //             else
    //             row+=".";
    //         }
    //         temp.add(row);
    //     }
    //     ans.add(temp);
    // }

