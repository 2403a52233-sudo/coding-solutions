# Count Sub Islands

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given two `m x n` binary matrices `grid1` and `grid2` containing only `0`'s (representing water) and `1`'s (representing land). An  **island**  is a group of `1`'s connected  **4-directionally**  (horizontal or vertical). Any cells outside of the grid are considered water cells.

An island in `grid2` is considered a  **sub-island** if there is an island in `grid1` that contains  **all**  the cells that make up  **this**  island in `grid2`.

Return the  ***number**  of islands in  *`grid2`* that are considered  **sub-islands** *.

 

Original
Java
 **Example 1:** 

```
Input: grid1 = [[1,1,1,0,0],[0,1,1,1,1],[0,0,0,0,0],[1,0,0,0,0],[1,1,0,1,1]], grid2 = [[1,1,1,0,0],[0,0,1,1,1],[0,1,0,0,0],[1,0,1,1,0],[0,1,0,1,0]]
Output: 3
Explanation: In the picture above, the grid on the left is grid1 and the grid on the right is grid2.
The 1s colored red in grid2 are those considered to be part of a sub-island. There are three sub-islands.

```

 **Example 2:** 

```
Input: grid1 = [[1,0,1,0,1],[1,1,1,1,1],[0,0,0,0,0],[1,1,1,1,1],[1,0,1,0,1]], grid2 = [[0,0,0,0,0],[1,1,1,1,1],[0,1,0,1,0],[0,1,0,1,0],[1,0,0,0,1]]
Output: 2 
Explanation: In the picture above, the grid on the left is grid1 and the grid on the right is grid2.
The 1s colored red in grid2 are those considered to be part of a sub-island. There are two sub-islands.

```

 

 **Constraints:** 

- m == grid1.length == grid2.length
- n == grid1[i].length == grid2[i].length
- 1 <= m, n <= 500
- grid1[i][j] and grid2[i][j] are either 0 or 1.

## Solution

**Language:** Java  
**Runtime:** 211 ms (beats 5.22%)  
**Memory:** 193.6 MB (beats 5.07%)  
**Submitted:** 2026-11-17T06:08:36.023Z  

```java

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

```

---

[View on LeetCode](https://leetcode.com/problems/count-sub-islands/)