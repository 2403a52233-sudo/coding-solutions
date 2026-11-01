class Solution {
    public char findTheDifference(String s, String t) {
       HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
         for(int i=0;i<t.length();i++){
            char b=t.charAt(i);
            hm.put(b,hm.getOrDefault(b,0)-1);
        }
        for(int i=0;i<t.length();i++){
            char d=t.charAt(i);
            if(hm.get(d)<0) return d;
        }
        return ' ';
    }
}
