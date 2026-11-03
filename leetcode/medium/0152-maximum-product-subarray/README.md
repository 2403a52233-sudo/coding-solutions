# Maximum Product Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums`, find a subarray that has the largest product, and return  *the product*.

The test cases are generated so that the answer will fit in a  **32-bit**  integer.

 **Note**  that the product of an array with a single element is the value of that element.

 

 **​​​​​​​Example 1:** 

```
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

```

 **Example 2:** 

```
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

```

 

 **Constraints:** 

- 1 <= nums.length <= 2 * 104
- -10 <= nums[i] <= 10
- The product of any subarray of nums is guaranteed to fit in a 32-bit integer.

## Solution

**Language:** Java  
**Runtime:** 298 ms (beats 5.45%)  
**Memory:** 46.7 MB (beats 86.82%)  
**Submitted:** 2026-11-03T18:07:45.877Z  

```java
class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];

        for(int i=0;i<nums.length;i++){
            int pro=1;
        for(int j=i;j<nums.length;j++){
          pro*=nums[j];
            max=Math.max(max,pro);
            }
        }
        return max;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-product-subarray/)