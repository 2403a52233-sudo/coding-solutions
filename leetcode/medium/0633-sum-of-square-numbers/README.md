# Sum of Square Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a non-negative integer `c`, decide whether there're two integers `a` and `b` such that `a2 + b2 = c`.

 

 **Example 1:** 

```
Input: c = 5
Output: true
Explanation: 1  *1 + 2*  2 = 5

```

 **Example 2:** 

```
Input: c = 3
Output: false

```

 

 **Constraints:** 

- 0 <= c <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 40.9 MB  
**Submitted:** 2026-11-05T15:47:26.839Z  

```java
class Solution {
    public boolean judgeSquareSum(int c) {
        int nums[]=new int[c+1];
        for(int i=0;i<c;i++)
            nums[i]=i;
        int i=0;
        int j=1;
        while(j<c){
            if((long)(nums[i]*nums[i])+(nums[j]*nums[j])==c){
                return true;
            }
            j++;
            if(j==c){
                i++;
                j=i+1;
            }
            
        }
    return false;  
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sum-of-square-numbers/)