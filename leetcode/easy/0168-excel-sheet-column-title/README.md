# Excel Sheet Column Title

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `columnNumber`, return  *its corresponding column title as it appears in an Excel sheet*.

For example:

```
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...

```

 

 **Example 1:** 

```
Input: columnNumber = 1
Output: "A"

```

 **Example 2:** 

```
Input: columnNumber = 28
Output: "AB"

```

 **Example 3:** 

```
Input: columnNumber = 701
Output: "ZY"

```

 

 **Constraints:** 

- 1 <= columnNumber <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 1.13%)  
**Memory:** 42.5 MB (beats 58.38%)  
**Submitted:** 2026-10-02T04:51:39.094Z  

```java
class Solution {
    public String convertToTitle(int n) {
        String res="";
        while(n>0){
            res=(char)('A'+(n-1)%26)+res;
            n=(n-1)/26;
        }
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/excel-sheet-column-title/)