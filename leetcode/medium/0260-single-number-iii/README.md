# Single Number III

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums`, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in  **any order**.

You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

 

 **Example 1:** 

```
Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer.

```

 **Example 2:** 

```
Input: nums = [-1,0]
Output: [-1,0]

```

 **Example 3:** 

```
Input: nums = [0,1]
Output: [1,0]

```

 

 **Constraints:** 

- 2 <= nums.length <= 3 * 104
- -231 <= nums[i] <= 231 - 1
- Each integer in nums will appear twice, only two integers will appear once.

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 28.83%)  
**Memory:** 47.8 MB (beats 87.24%)  
**Submitted:** 2026-09-28T07:29:16.489Z  

```java
class Solution {
    public int[] singleNumber(int[] nums) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        int ans[]=new int[2];
        int j=0;

        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])==1){
                ans[j]=nums[i];
                j++;
            }
        }

        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/single-number-iii/)