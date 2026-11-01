class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int i=nums[0];
        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum=sum+nums[j]-i;


        }
        return sum;
        
        
    }
}