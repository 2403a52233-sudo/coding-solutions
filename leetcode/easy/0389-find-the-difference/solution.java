class Solution {
    public char findTheDifference(String s, String t) {
        String a = s.concat(t);
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char x:a.toCharArray())
            hm.put(x,hm.getOrDefault(x,0)+1);
        for(char x:t.toCharArray()){
            if(hm.get(x)==1) return x;
        }
    return ' ';
    }
}