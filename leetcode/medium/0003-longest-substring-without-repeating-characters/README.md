# Longest Substring Without Repeating Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, find the length of the  **longest**   **substring**  without duplicate characters.

 

 **Example 1:** 

```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

```

 **Example 2:** 

```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

```

 **Example 3:** 

```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

```

 

 **Constraints:** 

- 0 <= s.length <= 105
- s consists of English letters, digits, symbols and spaces.

## Solution

**Language:** Java  
**Runtime:** 69 ms (beats 26.67%)  
**Memory:** 47.2 MB (beats 93.67%)  
**Submitted:** 2026-11-03T17:51:59.739Z  

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int max=0;
        HashSet<Character> hs=new HashSet<>();
        while(j<s.length()){
            if(!hs.contains(s.charAt(j))){
                hs.add(s.charAt(j));
                max=Math.max(max,j-i+1);
                j++;
            }
            else{
                hs.remove(s.charAt(i));
                i++;
            }
        }
    return max;  
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters/)