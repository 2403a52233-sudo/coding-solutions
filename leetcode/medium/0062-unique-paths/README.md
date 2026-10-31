# Unique Paths

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

There is a robot on an `m x n` grid. The robot is initially located at the  **top-left corner**  (i.e., `grid[0][0]`). The robot tries to move to the  **bottom-right corner**  (i.e., `grid[m - 1][n - 1]`). The robot can only move either down or right at any point in time.

Given the two integers `m` and `n`, return  *the number of possible unique paths that the robot can take to reach the bottom-right corner*.

The test cases are generated so that the answer will be less than or equal to `2 * 109`.

 

 **Example 1:** 

```
Input: m = 3, n = 7
Output: 28

```

 **Example 2:** 

```
Input: m = 3, n = 2
Output: 3
Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Down -> Down
2. Down -> Down -> Right
3. Down -> Right -> Down

```

 

 **Constraints:** 

- 1 <= m, n <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.3 MB (beats 98.25%)  
**Submitted:** 2026-10-31T10:24:28.839Z  

```java
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

```

---

[View on LeetCode](https://leetcode.com/problems/unique-paths/)