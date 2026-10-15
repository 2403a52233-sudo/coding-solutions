class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i=0;
        int j=0;
        int temp=0;
        while(j<nums.length){
            if(nums[j]%2==0){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            j++;
        }
        i=1;
        j=nums.length-2;
        temp=0;
        while(i<j){
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i+=2;
            j-=2;
        }
        return nums;
    }
}