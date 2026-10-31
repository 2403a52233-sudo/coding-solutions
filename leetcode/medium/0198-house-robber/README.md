# House Robber

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and  **it will automatically contact the police if two adjacent houses were broken into on the same night**.

Given an integer array `nums` representing the amount of money of each house, return  *the maximum amount of money you can rob tonight  **without alerting the police***.

 

 **Example 1:** 

```
Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.

```

 **Example 2:** 

```
Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.

```

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 0 <= nums[i] <= 400

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42 MB (beats 98.41%)  
**Submitted:** 2026-10-31T06:47:22.201Z  

```java
class Solution {
    int rob(int nums[],int idx,int memo[]){
        if(idx>=nums.length) return 0;
        if(memo[idx]!=-1) return memo[idx];
        int pick=nums[idx]+rob(nums,idx+2,memo);
        int npick=rob(nums,idx+1,memo);
        return memo[idx]=Math.max(pick,npick);
    }

    public int rob(int[] nums) {
        int memo[]=new int[nums.length+1];
        Arrays.fill(memo,-1);
      return Math.max(rob(nums,0,memo),rob(nums,1,memo));
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/house-robber/)