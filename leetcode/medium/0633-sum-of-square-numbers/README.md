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
**Runtime:** 3 ms (beats 97.78%)  
**Memory:** 41.5 MB (beats 88.42%)  
**Submitted:** 2026-11-05T15:59:58.397Z  

```java
class Solution {
    public boolean judgeSquareSum(int c) {
        long i=0;
        long j=(long)Math.sqrt(c);
        long sum=0;
        while(i<=j){
            sum=(i*i+j*j);
            if(sum==c)
                return true;
            else if(sum<c)i++;
            else j--;
        }
    return false;  
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sum-of-square-numbers/)