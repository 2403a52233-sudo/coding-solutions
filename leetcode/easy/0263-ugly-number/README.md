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
**Runtime:** 1 ms (beats 99.13%)  
**Memory:** 42.9 MB (beats 14.84%)  
**Submitted:** 2026-10-07T20:45:48.893Z  

```java
class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        int p[]={2,3,5};
    for(int i=0;i<=2;i++){
        while(n%p[i]==0)
        n=n/p[i];
        }
        return n==1;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/ugly-number/)