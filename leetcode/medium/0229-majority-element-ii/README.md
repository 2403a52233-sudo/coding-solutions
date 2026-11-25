# Majority Element II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array of size `n`, find all elements that appear more than `⌊n / 3⌋` times.

 

Original
Java
 **Example 1:** 

```
Input: nums = [3,2,3]
Output: [3]

```

 **Example 2:** 

```
Input: nums = [1]
Output: [1]

```

 **Example 3:** 

```
Input: nums = [1,2]
Output: [1,2]

```

 

 **Constraints:** 

- 1 <= nums.length <= 5 * 104
- -109 <= nums[i] <= 109

 

 **Follow up:**  Could you solve the problem in linear time and in `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 14 ms (beats 42.17%)  
**Memory:** 52.9 MB (beats 13.64%)  
**Submitted:** 2026-11-25T08:37:25.026Z  

```java
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int x:nums) hm.put(x,hm.getOrDefault(x,0)+1);
        for(int x:hm.keySet())
            if(hm.get(x)>nums.length/3) al.add(x);
    return al;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element-ii/)