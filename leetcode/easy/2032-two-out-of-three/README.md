# Two Out of Three

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given three integer arrays `nums1`, `nums2`, and `nums3`, return  *a  **distinct**  array containing all the values that are present in  **at least two**  out of the three arrays. You may return the values in  **any**  order*.

 

 **Example 1:** 

```
Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
Output: [3,2]
Explanation: The values that are present in at least two arrays are:
- 3, in all three arrays.
- 2, in nums1 and nums2.

```

 **Example 2:** 

```
Input: nums1 = [3,1], nums2 = [2,3], nums3 = [1,2]
Output: [2,3,1]
Explanation: The values that are present in at least two arrays are:
- 2, in nums2 and nums3.
- 3, in nums1 and nums2.
- 1, in nums1 and nums3.

```

 **Example 3:** 

```
Input: nums1 = [1,2,2], nums2 = [4,3,3], nums3 = [5]
Output: []
Explanation: No value is present in at least two arrays.

```

 

 **Constraints:** 

- 1 <= nums1.length, nums2.length, nums3.length <= 100
- 1 <= nums1[i], nums2[j], nums3[k] <= 100

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 17.16%)  
**Memory:** 46.5 MB (beats 78.89%)  
**Submitted:** 2026-11-07T09:17:06.589Z  

```java
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        HashSet<Integer> hs3=new HashSet<>();

        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();

        for(int x:nums1) hs1.add(x);
        for(int x:nums2) hs2.add(x);
        for(int x:nums3) hs3.add(x); 
  
        for(int x:hs1) hm.put(x,hm.getOrDefault(x,0)+1);
        for(int x:hs2) hm.put(x,hm.getOrDefault(x,0)+1);
        for(int x:hs3) hm.put(x,hm.getOrDefault(x,0)+1);

        for(int x:hm.keySet()){
            if(hm.get(x)>=2) 
                al.add(x);
        }
    return al;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/two-out-of-three/)