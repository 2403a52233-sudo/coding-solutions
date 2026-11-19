class Solution {
    long sum=0;
    void fun(int grid[][],int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length) return;
        if(grid[i][j]==0) return;
        sum+=grid[i][j];
        grid[i][j]=0;
        fun(grid,i+1,j);
        fun(grid,i,j+1);
        fun(grid,i-1,j);
        fun(grid,i,j-1);
    }

    public int countIslands(int[][] grid, int k) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]>0){
                        sum=0;
                    fun(grid,i,j);
                    if(sum%k==0)c++;
                }
            }
        }
    return c;
    }
}