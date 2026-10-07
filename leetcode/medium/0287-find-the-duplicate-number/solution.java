class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        Arrays.sort(nums);
        while(i<nums.length){
            if(nums[i]==nums[i+1]) return nums[i];
            i++;
        }
        return -1;
        
    }
}