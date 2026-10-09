# Rotate Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

 

 **Example 1:** 

```
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

```

 **Example 2:** 

```
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -231 <= nums[i] <= 231 - 1
- 0 <= k <= 105

 

 **Follow up:** 

- Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
- Could you do it in-place with O(1) extra space?

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 94.17%)  
**Memory:** 268.6 MB (beats 57.57%)  
**Submitted:** 2026-10-09T18:17:33.916Z  

```java
class Solution {
    public void rotate(int[] nums, int k) {
        /*int i=0;
        int arr[]=new int[nums.length];
        k=k%nums.length;
        while(i<nums.length){
            arr[(i+k)%nums.length]=nums[i];
            i++;
        }
      for(int j=0;j<nums.length;j++)
      nums[j]=arr[j];*/
      k=k%nums.length;
      int i=0;
      int j=nums.length-1;
      while(i<j){
        swap(nums,i,j);
        i++;
        j--;
      }
      i=0;
      j=k-1;
      while(i<j){
          swap(nums,i,j);
        i++;
        j--;
      }
      i=k;
      j=nums.length-1;
      while(i<j){
         swap(nums,i,j);
        i++;
        j--;
      }
    }
public void swap(int[] nums,int i,int j){
    int temp=nums[i];
    nums[i]=nums[j];
    nums[j]=temp;
}
    
}
```

---

[View on LeetCode](https://leetcode.com/problems/rotate-array/)