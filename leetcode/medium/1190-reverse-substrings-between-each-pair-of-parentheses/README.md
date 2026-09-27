# Reverse Substrings Between Each Pair of Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s` that consists of lower case English letters and brackets.

Reverse the strings in each pair of matching parentheses, starting from the innermost one.

Your result should  **not**  contain any brackets.

 

 **Example 1:** 

```
Input: s = "(abcd)"
Output: "dcba"

```

 **Example 2:** 

```
Input: s = "(u(love)i)"
Output: "iloveu"
Explanation: The substring "love" is reversed first, then the whole string is reversed.

```

 **Example 3:** 

```
Input: s = "(ed(et(oc))el)"
Output: "leetcode"
Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.

```

 

 **Constraints:** 

- 1 <= s.length <= 2000
- s only contains lower case English characters and parentheses.
- It is guaranteed that all parentheses are balanced.

## Solution

**Language:** Java  
**Runtime:** 12 ms (beats 35.97%)  
**Memory:** 43.2 MB (beats 75.11%)  
**Submitted:** 2026-09-27T04:32:42.895Z  

```java
class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb=new StringBuilder(s);

        int i=0;
        int j=1;

        while(j<sb.length()){
            if(sb.charAt(i)=='('){
                if(sb.charAt(j)=='('){
                    i=j;
                    j++;
                }
                else if(sb.charAt(j)==')'){
                    rev(sb,i+1,j-1);

                    sb.deleteCharAt(j);
                    sb.deleteCharAt(i);

                    i=0;
                    j=1;
                }
                else{
                    j++;
                }
            }
            else{
                i++;
                j=i+1;
            }
        }

        return sb.toString();
    }

    public void rev(StringBuilder sb,int i,int j){
        while(i<j){
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);

            i++;
            j--;
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/)