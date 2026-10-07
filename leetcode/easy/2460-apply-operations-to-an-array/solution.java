class Solution {
    public int[] applyOperations(int[] nums) {
        int i=0;
        while(i<nums.length-1){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=nums[i+1]*0;
            }
            i++;
        }
        i=0;
        int j=1;
        int temp=0;
        while(i<nums.length && j<nums.length){
            if(nums[i]==0){
                if(nums[j]!=0){
                    temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;}
                else
                j++;
            }
            else {
                i++;
                j++;
                }
        }
        return nums;
        
    }
}