# Intersection of Two Arrays II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two integer arrays `nums1` and `nums2`, return  *an array of their intersection*. Each element in the result must appear as many times as it shows in both arrays and you may return the result in  **any order**.

 

 **Example 1:** 

```
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

```

 **Example 2:** 

```
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.

```

 

 **Constraints:** 

- 1 <= nums1.length, nums2.length <= 1000
- 0 <= nums1[i], nums2[i] <= 1000

 

 **Follow up:** 

- What if the given array is already sorted? How would you optimize your algorithm?
- What if nums1's size is small compared to nums2's size? Which algorithm is better?
- What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 36.93%)  
**Memory:** 45.7 MB (beats 9.12%)  
**Submitted:** 2026-10-07T20:04:04.779Z  

```java
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap <Integer,Integer> hm1=new HashMap<>();
        HashMap <Integer,Integer> hm2=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();

        for(int x:nums1)
        hm1.put(x,hm1.getOrDefault(x,0)+1);
        for(int x:nums2)
        hm2.put(x,hm2.getOrDefault(x,0)+1);

        for(int x:hm1.keySet()){
            if(hm2.containsKey(x)){
                int n=Math.min(hm1.get(x),hm2.get(x));
                for(int i=0;i<n;i++)
                al.add(x);
            }
        }
        int i=0;
        int arr[]=new int[al.size()];
        for(int x:al){
            arr[i]=x;
            i++;
        }
        return arr;

        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/intersection-of-two-arrays-ii/)