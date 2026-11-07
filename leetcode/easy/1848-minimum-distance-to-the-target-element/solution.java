class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                return Math.abs(i-start);
            }
        }
        return 0;
    }
}