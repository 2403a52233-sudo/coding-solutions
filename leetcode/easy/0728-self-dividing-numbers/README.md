# Self Dividing Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A  **self-dividing number**  is a number that is divisible by every digit it contains.

- For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

A  **self-dividing number**  is not allowed to contain the digit zero.

Given two integers `left` and `right`, return  *a list of all the  **self-dividing numbers**  in the range*  `[left, right]` (both  **inclusive**).

 

 **Example 1:** 

```
Input: left = 1, right = 22
Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]

```

 **Example 2:** 

```
Input: left = 47, right = 85
Output: [48,55,66,77]

```

 

 **Constraints:** 

- 1 <= left <= right <= 104

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 54.46%)  
**Memory:** 42 MB (beats 86.69%)  
**Submitted:** 2026-11-08T13:39:09.148Z  

```java
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> al=new ArrayList<>();
         int rem=0;
        for(int i=left;i<=right;i++){
            int n=i;
            while(n!=0){
                rem=n%10;
                if(rem==0 || i%rem!=0)
                    break;
                n/=10;
            }
        if(n==0) al.add(i);
        }
    return al;
    }
}
      
```

---

[View on LeetCode](https://leetcode.com/problems/self-dividing-numbers/)