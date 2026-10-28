import java.util.*;
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int key:hm.keySet()){
            al.add(hm.get(key));
        }
        Collections.sort(al);
        int max=al.get(al.size()-1);
        int c=0;
        for(int i=0;i<al.size();i++){
            if(al.get(i)==max)
                c+=al.get(i);
        }
        return c;
    }
}