class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        HashSet<Integer> hs3=new HashSet<>();

        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();

        for(int x:nums1) hs1.add(x);
        for(int x:nums2) hs2.add(x);
        for(int x:nums3) hs3.add(x); 
  
        for(int x:hs1) hm.put(x,hm.getOrDefault(x,0)+1);
        for(int x:hs2) hm.put(x,hm.getOrDefault(x,0)+1);
        for(int x:hs3) hm.put(x,hm.getOrDefault(x,0)+1);

        for(int x:hm.keySet()){
            if(hm.get(x)>=2) 
                al.add(x);
        }
    return al;
    }
}