class Solution {
    public int findKthPositive(int[] arr, int k) {
    ArrayList<Integer> al=new ArrayList<>();
    HashSet<Integer> hs=new HashSet<>();
    for(int x:arr) hs.add(x);
    for(int i=1;al.size()<k;i++){
        if(!hs.contains(i)) al.add(i);
    }
    if(k>al.size()) return 0;
    return al.get(k-1);
    }
}