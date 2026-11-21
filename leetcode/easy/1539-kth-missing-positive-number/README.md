# Kth Missing Positive Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `arr` of positive integers sorted in a  **strictly increasing order**, and an integer `k`.

Return  *the*  `kth`  ***positive**  integer that is  **missing**  from this array.*

 

Original
Java
 **Example 1:** 

```
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

```

 **Example 2:** 

```
Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.

```

 

 **Constraints:** 

- 1 <= arr.length <= 1000
- 1 <= arr[i] <= 1000
- 1 <= k <= 1000
- arr[i] < arr[j] for 1 <= i < j <= arr.length

 

 **Follow up:** 

Could you solve this problem in less than O(n) complexity?

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 6.55%)  
**Memory:** 46 MB (beats 5.26%)  
**Submitted:** 2026-11-21T18:10:18.241Z  

```java
class Solution {
    public int findKthPositive(int[] arr, int k) {
    ArrayList<Integer> al=new ArrayList<>();
    HashSet<Integer> hs=new HashSet<>();
    for(int x:arr) hs.add(x);
    for(int i=1;al.size()<k;i++){
        if(!hs.contains(i)) al.add(i);
    }
    if(k>al.size()) return 0;
    return al.get(k-1);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/kth-missing-positive-number/)