# Count Elements With Maximum Frequency

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array `nums` consisting of  **positive**  integers.

Return  *the  **total frequencies**  of elements in*  `nums`  *such that those elements all have the  **maximum**  frequency*.

The  **frequency**  of an element is the number of occurrences of that element in the array.

 

 **Example 1:** 

```
Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.

```

 **Example 2:** 

```
Input: nums = [1,2,3,4,5]
Output: 5
Explanation: All elements of the array have a frequency of 1 which is the maximum.
So the number of elements in the array with maximum frequency is 5.

```

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 1 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 8.00%)  
**Memory:** 43.9 MB (beats 60.74%)  
**Submitted:** 2026-10-28T18:22:25.264Z  

```java
import java.util.*;
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int key:hm.keySet()){
            al.add(hm.get(key));
        }
        Collections.sort(al);
        int max=al.get(al.size()-1);
        int c=0;
        for(int i=0;i<al.size();i++){
            if(al.get(i)==max)
                c+=al.get(i);
        }
        return c;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-elements-with-maximum-frequency/)