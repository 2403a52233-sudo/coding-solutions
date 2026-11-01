class Solution {
    public char findTheDifference(String s, String t) {
        for(char x : s.toCharArray()) {
            t = t.replaceFirst(String.valueOf(x), "");
        }
        return t.charAt(0);
    }
}