class Solution {
    int fun(int n,int m,int i,int j,int memo[][]){
        if(i>=n || j>=m) return 0;
        else if(i==n-1 && j==m-1) return 1;
        if(memo[i][j]!=-1) return memo[i][j];
        int down=fun(n,m,i+1,j,memo);
        int right=fun(n,m,i,j+1,memo);
        return memo[i][j]=down+right;
    }
    public int uniquePaths(int m, int n) {
        int memo[][]=new int[m][n];
        for(int i=0;i<m;i++){
                Arrays.fill(memo[i],-1);
            }
        return fun(m,n,0,0,memo);
    }
        
    }
