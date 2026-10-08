# Sqrt(x)

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a non-negative integer `x`, return  *the square root of* `x` *rounded down to the nearest integer*. The returned integer should be  **non-negative**  as well.

You  **must not use**  any built-in exponent function or operator.

- For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

 

 **Example 1:** 

```
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

```

 **Example 2:** 

```
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

```

 

 **Constraints:** 

- 0 <= x <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 42.3 MB (beats 94.90%)  
**Submitted:** 2026-10-08T04:48:29.444Z  

```java
class Solution {
    public int mySqrt(int x) {
        int i=1;
        int j=x;

        while(i<=j){
            long m=i+(j-i)/2;

            if(m*m==x)
                return (int)m;
            else if(m*m<x)
                i=(int)m+1;
            else
                j=(int)m-1;
        }

        return j;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sqrtx/)