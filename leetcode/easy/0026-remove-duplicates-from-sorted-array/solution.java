class Solution {
    public int removeDuplicates(int[] nums) {
          LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++) lhs.add(nums[i]);
        int i=0;
        for(int x:lhs){
            nums[i]=x;
            i++;
        }
        return lhs.size();
}
}