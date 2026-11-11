class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int dum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
   for(int i=0;i<nums.length;i++){  
        if(nums[i]>9){
                while(nums[i]!=0){
            int rem=nums[i]%10;
            dum+=rem;
            nums[i]/=10;
        }}
        dum+=nums[i];
    }
    return Math.abs(sum-dum);
        
    }
}