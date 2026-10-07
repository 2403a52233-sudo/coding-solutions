# Duplicate Zeros

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a fixed-length integer array `arr`, duplicate each occurrence of zero, shifting the remaining elements to the right.

 **Note**  that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

 

 **Example 1:** 

```
Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

```

 **Example 2:** 

```
Input: arr = [1,2,3]
Output: [1,2,3]
Explanation: After calling your function, the input array is modified to: [1,2,3]

```

 

 **Constraints:** 

- 1 <= arr.length <= 104
- 0 <= arr[i] <= 9

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 33.75%)  
**Memory:** 47.1 MB (beats 8.88%)  
**Submitted:** 2026-10-07T11:40:04.504Z  

```java
class Solution {
    public void duplicateZeros(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int i=0;
        while(i<arr.length && st.size()<arr.length){
            st.push(arr[i]);
            if(arr[i]==0 && st.size()<arr.length)
                st.push(0);
                i++;
        }
        i=0;
        for(int x:st){
        arr[i]=x;
        i++;}
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/duplicate-zeros/)