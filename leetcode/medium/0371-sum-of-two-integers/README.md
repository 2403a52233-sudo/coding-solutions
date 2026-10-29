# Sum of Two Integers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two integers `a` and `b`, return  *the sum of the two integers without using the operators*  `+`  *and*  `-`.

 

 **Example 1:** 

```
Input: a = 1, b = 2
Output: 3

```

 **Example 2:** 

```
Input: a = 2, b = 3
Output: 5

```

 

 **Constraints:** 

- -1000 <= a, b <= 1000

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.8 MB (beats 71.14%)  
**Submitted:** 2026-10-29T03:33:22.124Z  

```java
class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int c=(a&b)<<1;
            a=a^b;
            b=c;
        }
    return a; 
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sum-of-two-integers/)