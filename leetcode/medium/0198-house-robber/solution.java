class Solution {
    int rob(int nums[],int idx,int memo[]){
        if(idx>=nums.length) return 0;
        if(memo[idx]!=-1) return memo[idx];
        int pick=nums[idx]+rob(nums,idx+2,memo);
        int npick=rob(nums,idx+1,memo);
        return memo[idx]=Math.max(pick,npick);
    }

    public int rob(int[] nums) {
        int memo[]=new int[nums.length+1];
        Arrays.fill(memo,-1);
      return Math.max(rob(nums,0,memo),rob(nums,1,memo));
    }
}