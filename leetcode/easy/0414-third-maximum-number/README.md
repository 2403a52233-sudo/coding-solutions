# Third Maximum Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums`.

Return the  **third distinct maximum**  number in this array. If the third  **maximum**  does not exist, return the  **maximum**  number.

 

 **Example 1:** 

```
Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.

```

 **Example 2:** 

```
Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.

```

 **Example 3:** 

```
Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -231 <= nums[i] <= 231 - 1

 

 **Follow up:**  Can you find an `O(n)` solution?

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 29.42%)  
**Memory:** 44.8 MB (beats 65.18%)  
**Submitted:** 2026-10-15T13:21:15.694Z  

```java
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length-1;
        int j=nums.length-2;
        int c=1;

        while(j>=0){
            if(nums[i]!=nums[j]){
                c++;
                i=j;
                if(c==3) return nums[i];
                j--;
            }
            else{
                j--;
            }
        }
        return nums[nums.length-1];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/third-maximum-number/)