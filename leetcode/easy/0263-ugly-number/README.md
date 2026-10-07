# Ugly Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

An  **ugly number**  is a  *positive*  integer which does not have a prime factor other than 2, 3, and 5.

Given an integer `n`, return `true`  *if*  `n`  *is an  **ugly number***.

 

 **Example 1:** 

```
Input: n = 6
Output: true
Explanation: 6 = 2 × 3

```

 **Example 2:** 

```
Input: n = 1
Output: true
Explanation: 1 has no prime factors.

```

 **Example 3:** 

```
Input: n = 14
Output: false
Explanation: 14 is not ugly since it includes the prime factor 7.

```

 

 **Constraints:** 

- -231 <= n <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.1 MB  
**Submitted:** 2026-10-07T20:38:59.011Z  

```java
class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
    for(int i=2;i<=n;i++){
    if(n%i==0){
        if(i!=2 && i!=3 && i!=5)
            return false;
    }
    }
    
    return true;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/ugly-number/)