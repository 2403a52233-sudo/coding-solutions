# Difference Between Element Sum and Digit Sum of an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a positive integer array `nums`.

- The element sum is the sum of all the elements in nums.
- The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.

Return  *the  **absolute**  difference between the  **element sum**  and  **digit sum**  of* `nums`.

 **Note**  that the absolute difference between two integers `x` and `y` is defined as `|x - y|`.

 

Original
Java
 **Example 1:** 

```
Input: nums = [1,15,6,3]
Output: 9
Explanation: 
The element sum of nums is 1 + 15 + 6 + 3 = 25.
The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
The absolute difference between the element sum and digit sum is |25 - 16| = 9.

```

 **Example 2:** 

```
Input: nums = [1,2,3,4]
Output: 0
Explanation:
The element sum of nums is 1 + 2 + 3 + 4 = 10.
The digit sum of nums is 1 + 2 + 3 + 4 = 10.
The absolute difference between the element sum and digit sum is |10 - 10| = 0.

```

 

 **Constraints:** 

- 1 <= nums.length <= 2000
- 1 <= nums[i] <= 2000

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 24.24%)  
**Memory:** 46.2 MB (beats 60.04%)  
**Submitted:** 2026-11-11T16:18:40.068Z  

```java
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int dum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
   for(int i=0;i<nums.length;i++){  
        if(nums[i]>9){
                while(nums[i]!=0){
            int rem=nums[i]%10;
            dum+=rem;
            nums[i]/=10;
        }}
        dum+=nums[i];
    }
    return Math.abs(sum-dum);
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/)