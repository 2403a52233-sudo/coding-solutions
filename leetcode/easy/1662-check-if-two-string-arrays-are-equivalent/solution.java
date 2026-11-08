class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s="";
        String a="";
        for(int i=0;i<word1.length;i++) s+=word1[i];
        for(int i=0;i<word2.length;i++) a+=word2[i];
        if(s.equals(a)) return true;
    return false;  
    }
}