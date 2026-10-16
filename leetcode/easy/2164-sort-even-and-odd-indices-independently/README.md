# Sort Even and Odd Indices Independently

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a  **0-indexed**  integer array `nums`. Rearrange the values of `nums` according to the following rules:

- Sort the values at odd indices of nums in non-increasing order. For example, if nums = [4,1,2,3] before this step, it becomes [4,3,2,1] after. The values at odd indices 1 and 3 are sorted in non-increasing order.
- Sort the values at even indices of nums in non-decreasing order. For example, if nums = [4,1,2,3] before this step, it becomes [2,1,4,3] after. The values at even indices 0 and 2 are sorted in non-decreasing order.

Return  *the array formed after rearranging the values of*  `nums`.

 

 **Example 1:** 

```
Input: nums = [4,1,2,3]
Output: [2,3,4,1]
Explanation: 
First, we sort the values present at odd indices (1 and 3) in non-increasing order.
So, nums changes from [4,1,2,3] to [4,3,2,1].
Next, we sort the values present at even indices (0 and 2) in non-decreasing order.
So, nums changes from [4,1,2,3] to [2,3,4,1].
Thus, the array formed after rearranging the values is [2,3,4,1].

```

 **Example 2:** 

```
Input: nums = [2,1]
Output: [2,1]
Explanation: 
Since there is exactly one odd index and one even index, no rearrangement of values takes place.
The resultant array formed is [2,1], which is the same as the initial array. 

```

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 1 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 78.87%)  
**Memory:** 45.3 MB (beats 98.47%)  
**Submitted:** 2026-10-16T06:41:07.494Z  

```java
class Solution {
    static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int[] sortEvenOdd(int[] nums) {
        int i=0;
        int j=2;
        while(i<nums.length){
            while(j<nums.length){
                if(nums[i]>nums[j]){
                    swap(nums,i,j);
                }
                j+=2;
            }
            i+=2;
            j=i+2;
        }

        i=1;
        j=3;
        while(i<nums.length){
            while(j<nums.length){
                if(nums[i]<nums[j]){
                    swap(nums,i,j);
                }
                j+=2;
            }
            i+=2;
            j=i+2;
        }
        return nums;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/sort-even-and-odd-indices-independently/)