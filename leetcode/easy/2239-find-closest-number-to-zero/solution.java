class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]>0) return nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
            if(nums[i]==0) return nums[i];
            if(nums[i]<= Math.abs(nums[i-1])) return nums[i];
            else return nums[i-1];
            }
        }
    return  nums[nums.length-1];
    }
}