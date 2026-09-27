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
**Runtime:** 38 ms (beats 5.27%)  
**Memory:** 47.5 MB (beats 6.12%)  
**Submitted:** 2026-09-27T04:14:49.230Z  

```java
class Solution {
    public String reverseParentheses(String s) {
        Stack <Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=')')
            st.push(c);
            else {
                String x="";
                while(!st.isEmpty() &&st.peek()!='('){
                    x=x+st.pop();}
                    st.pop();
                
                for(int j=0;j<x.length();j++)
                st.push(x.charAt(j));

            }
        }
        String a="";
        while(!st.isEmpty())
            a=st.pop()+a;

            return a;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/)