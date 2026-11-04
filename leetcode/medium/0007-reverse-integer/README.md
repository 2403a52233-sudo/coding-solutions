# Reverse Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a signed 32-bit integer `x`, return `x` *with its digits reversed*. If reversing `x` causes the value to go outside the signed 32-bit integer range `[-231, 231 - 1]`, then return `0`.

 **Assume the environment does not allow you to store 64-bit integers (signed or unsigned).** 

 

 **Example 1:** 

```
Input: x = 123
Output: 321

```

 **Example 2:** 

```
Input: x = -123
Output: -321

```

 **Example 3:** 

```
Input: x = 120
Output: 21

```

 

 **Constraints:** 

- -231 <= x <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 21.17%)  
**Memory:** 42.2 MB (beats 78.97%)  
**Submitted:** 2026-11-04T15:15:27.349Z  

```java
class Solution {
    public int reverse(int n) {
    long rem=0;
     long rev=0;
     while(n!=0){
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
     }
  if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE) return 0;
  return (int)rev;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-integer/)