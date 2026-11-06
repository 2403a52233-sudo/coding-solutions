class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        if(nums.length==2) return -1;
        while(i<j){
            if(nums[i]<nums[i+1] && nums[j]>nums[j-1])
                return nums[i+1];
        }
    return -1;
    }
}