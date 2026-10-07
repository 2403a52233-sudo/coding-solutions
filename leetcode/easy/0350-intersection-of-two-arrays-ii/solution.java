class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap <Integer,Integer> hm1=new HashMap<>();
        HashMap <Integer,Integer> hm2=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();

        for(int x:nums1)
        hm1.put(x,hm1.getOrDefault(x,0)+1);
        for(int x:nums2)
        hm2.put(x,hm2.getOrDefault(x,0)+1);

        for(int x:hm1.keySet()){
            if(hm2.containsKey(x)){
                int n=Math.min(hm1.get(x),hm2.get(x));
                for(int i=0;i<n;i++)
                al.add(x);
            }
        }
        int i=0;
        int arr[]=new int[al.size()];
        for(int x:al){
            arr[i]=x;
            i++;
        }
        return arr;

        
    }
}