# Number of Good Pairs

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of integers `nums`, return  *the number of  **good pairs***.

A pair `(i, j)` is called  *good*  if `nums[i] == nums[j]` and `i` < `j`.

 

Original
Java
 **Example 1:** 

```
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

```

 **Example 2:** 

```
Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.

```

 **Example 3:** 

```
Input: nums = [1,2,3]
Output: 0

```

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 1 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 6.60%)  
**Memory:** 42.2 MB (beats 81.44%)  
**Submitted:** 2026-11-13T16:05:48.038Z  

```java
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j) c++;
            }
        }
    return c;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-good-pairs/)