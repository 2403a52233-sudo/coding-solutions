class Solution {
    public int minChanges(String s) {
        int i=0;
        int c=0;
        while(i<s.length()){
            if(s.charAt(i)!=s.charAt(i+1))
                c++;
        i+=2;
        }
    return c;   
    }
}