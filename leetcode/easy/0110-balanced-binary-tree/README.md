# Balanced Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a binary tree, determine if it is  **height-balanced**.

 

 **Example 1:** 

```
Input: root = [3,9,20,null,null,15,7]
Output: true

```

 **Example 2:** 

```
Input: root = [1,2,2,3,3,null,null,4,4]
Output: false

```

 **Example 3:** 

```
Input: root = []
Output: true

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [0, 5000].
- -104 <= Node.val <= 104

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 51.10%)  
**Memory:** 45.1 MB (beats 86.62%)  
**Submitted:** 2026-11-04T17:21:32.062Z  

```java
class Solution {
     public boolean isBalanced(TreeNode root) {
        if(root==null) return true;

        int l=height(root.left);
        int r=height(root.right);

        if(Math.abs(l-r)>1) return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }


           int height(TreeNode root){
            if(root==null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/balanced-binary-tree/)