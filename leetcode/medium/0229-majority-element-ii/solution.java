class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int x:nums) hm.put(x,hm.getOrDefault(x,0)+1);
        for(int x:hm.keySet())
            if(hm.get(x)>nums.length/3) al.add(x);
    return al;
    }
}