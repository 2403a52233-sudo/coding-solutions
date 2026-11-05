# Word Search

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an `m x n` grid of characters `board` and a string `word`, return `true`  *if*  `word`  *exists in the grid*.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

 

 **Example 1:** 

```
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true

```

 **Example 2:** 

```
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true

```

 **Example 3:** 

```
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
Output: false

```

 

 **Constraints:** 

- m == board.length
- n = board[i].length
- 1 <= m, n <= 6
- 1 <= word.length <= 15
- board and word consists of only lowercase and uppercase English letters.

 

 **Follow up:**  Could you use search pruning to make your solution faster with a larger `board`?

## Solution

**Language:** Java  
**Runtime:** 176 ms (beats 22.86%)  
**Memory:** 42.9 MB (beats 60.13%)  
**Submitted:** 2026-11-05T11:17:14.166Z  

```java
class Solution {
    boolean ans;
void fun(int i,int j,char[][] s,String w,int idx){
    if(idx>=w.length()) {
        ans=true ;
        return;}
    if(i<0 || j<0 || i>=s.length || j>=s[0].length) return;
    if(ans==true) return ;
    if(s[i][j]!=w.charAt(idx)) return ;
    char temp=s[i][j];
    s[i][j]='*';
    fun(i+1,j,s,w,idx+1);
    fun(i,j+1,s,w,idx+1);
    fun(i-1,j,s,w,idx+1);
    fun(i,j-1,s,w,idx+1);
    s[i][j]=temp;
 }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0))
                fun(i,j,board,word,0);
                if(ans==true) return true;
            }
        } 
    return false;  
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/word-search/)