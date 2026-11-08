class Solution {
    public int countServers(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int count=0;
                    for(int k=0;k<grid[0].length;k++){
                       if( grid[i][k]==1)
                       count++;
                    }
                    for(int k=0;k<grid.length;k++){
                        if(grid[k][j]==1)
                        count++;
                    }
                    if(count>2)c++;
                }
            }
        }
    return c;
    }
}