# Count Primes

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer `n`, return  *the number of prime numbers that are strictly less than*  `n`.

 

 **Example 1:** 

```
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

```

 **Example 2:** 

```
Input: n = 0
Output: 0

```

 **Example 3:** 

```
Input: n = 1
Output: 0

```

 

 **Constraints:** 

- 0 <= n <= 5 * 106

## Solution

**Language:** Java  
**Runtime:** 2027 ms (beats 5.00%)  
**Memory:** 41.6 MB (beats 100.00%)  
**Submitted:** 2026-10-07T20:18:56.806Z  

```java
class Solution{
    public int countPrimes(int n){
        if(n<=2)
            return 0;

        int d=1;

        for(int j=3;j<n;j+=2){
            boolean prime=true;

            for(int i=3;i*i<=j;i+=2){
                if(j%i==0){
                    prime=false;
                    break;
                }
            }

            if(prime)
                d++;
        }

        return d;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-primes/)