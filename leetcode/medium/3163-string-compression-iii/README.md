# String Compression III

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `word`, compress it using the following algorithm:

- Begin with an empty string comp. While word is not empty, use the following operation: Remove a maximum length prefix of word made of a single character c repeating at most 9 times. Append the length of the prefix followed by c to comp.

Return the string `comp`.

 

 **Example 1:** 

 **Input:**  word = "abcde"

 **Output:**  "1a1b1c1d1e"

 **Explanation:** 

Initially, `comp = ""`. Apply the operation 5 times, choosing `"a"`, `"b"`, `"c"`, `"d"`, and `"e"` as the prefix in each operation.

For each prefix, append `"1"` followed by the character to `comp`.

 **Example 2:** 

 **Input:**  word = "aaaaaaaaaaaaaabb"

 **Output:**  "9a5a2b"

 **Explanation:** 

Initially, `comp = ""`. Apply the operation 3 times, choosing `"aaaaaaaaa"`, `"aaaaa"`, and `"bb"` as the prefix in each operation.

- For prefix "aaaaaaaaa", append "9" followed by "a" to comp.
- For prefix "aaaaa", append "5" followed by "a" to comp.
- For prefix "bb", append "2" followed by "b" to comp.

 

 **Constraints:** 

- 1 <= word.length <= 2 * 105
- word consists only of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 1972 ms (beats 5.86%)  
**Memory:** 59.1 MB (beats 6.14%)  
**Submitted:** 2026-10-06T10:49:16.095Z  

```java
class Solution{
    public String compressedString(String word){
        int i=0;
        int j=0;
        int c=0;
        String s="";
        while(j<word.length()){
            if(word.charAt(i)==word.charAt(j)&&c<9){
                c++;
                j++;
            }
            else{
                s+=c;
                s+=word.charAt(i);
                c=0;
                i=j;
            }
        }
        s+=c;
        s+=word.charAt(i);
        return s;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/string-compression-iii/)