class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul=1;
        int c=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
                temp=i;}
            else mul=mul*nums[i];
        }
        if(c>1){
            for(int i=0;i<nums.length;i++)
                nums[i]=0;
        }
        else if(c==1){
            for(int i=0;i<nums.length;i++)
                nums[i]=0;
            nums[temp]=mul;
        }
        else{
            for(int i=0;i<nums.length;i++)
                nums[i]=mul/nums[i];
        }
    return nums;
    }
}