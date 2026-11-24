# Find Closest Number to Zero

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums` of size `n`, return  *the number with the value  **closest**  to* `0` *in* `nums`. If there are multiple answers, return  *the number with the  **largest**  value*.

 

Original
Java
 **Example 1:** 

```
Input: nums = [-4,-2,1,4,8]
Output: 1
Explanation:
The distance from -4 to 0 is |-4| = 4.
The distance from -2 to 0 is |-2| = 2.
The distance from 1 to 0 is |1| = 1.
The distance from 4 to 0 is |4| = 4.
The distance from 8 to 0 is |8| = 8.
Thus, the closest number to 0 in the array is 1.

```

 **Example 2:** 

```
Input: nums = [2,-1,1]
Output: 1
Explanation: 1 and -1 are both the closest numbers to 0, so 1 being larger is returned.

```

 

 **Constraints:** 

- 1 <= n <= 1000
- -105 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 9 ms (beats 6.50%)  
**Memory:** 46.9 MB (beats 25.99%)  
**Submitted:** 2026-11-24T17:42:10.081Z  

```java
class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]>0) return nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
            if(nums[i]==0) return nums[i];
            if(nums[i]<= Math.abs(nums[i-1])) return nums[i];
            else return nums[i-1];
            }
        }
    return  nums[nums.length-1];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-closest-number-to-zero/)