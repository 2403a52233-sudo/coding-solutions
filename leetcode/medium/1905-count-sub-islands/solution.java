
class Solution {
    void fun(int grid[][],int i,int j,ArrayList<String> al){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length) return;
        if(grid[i][j]==0) return;

        al.add(i+","+j);
        grid[i][j]=0;

        fun(grid,i+1,j,al);
        fun(grid,i-1,j,al);
        fun(grid,i,j+1,al);
        fun(grid,i,j-1,al);
    }

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        HashSet<String> hs=new HashSet<>();

        // Store all grid1 land indexes
        for(int i=0;i<grid1.length;i++){
            for(int j=0;j<grid1[0].length;j++){
                if(grid1[i][j]==1){
                    ArrayList<String> al=new ArrayList<>();
                    fun(grid1,i,j,al);
                    hs.addAll(al);
                }
            }
        }

        int c=0;

        // Find grid2 islands
        for(int i=0;i<grid2.length;i++){
            for(int j=0;j<grid2[0].length;j++){
                if(grid2[i][j]==1){
                    ArrayList<String> al=new ArrayList<>();
                    fun(grid2,i,j,al);

                    if(hs.containsAll(al)){
                        c++;
                    }
                }
            }
        }

        return c;
    }
}
