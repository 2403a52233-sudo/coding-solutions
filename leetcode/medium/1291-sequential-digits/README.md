# Sequential Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

An integer has  *sequential digits*  if and only if each digit in the number is one more than the previous digit.

Return a  **sorted**  list of all the integers in the range `[low, high]` inclusive that have sequential digits.

 

 **Example 1:** 

```
Input: low = 100, high = 300
Output: [123,234]

```

 **Example 2:** 

```
Input: low = 1000, high = 13000
Output: [1234,2345,3456,4567,5678,6789,12345]

```

 

 **Constraints:** 

- 10 <= low <= high <= 10^9

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.8 MB (beats 90.48%)  
**Submitted:** 2026-11-08T11:08:17.950Z  

```java
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=1;i<=9;i++){
            int temp=i;
            for(int j=i+1;j<=9;j++){
                temp=temp*10+j;
                if(temp>=low && temp<=high)
                    al.add(temp);
            }
        }
        Collections.sort(al);
    return al;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sequential-digits/)