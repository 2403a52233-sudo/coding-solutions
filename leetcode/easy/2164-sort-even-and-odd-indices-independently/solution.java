class Solution {
    static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int[] sortEvenOdd(int[] nums) {
        int i=0;
        int j=2;
        while(i<nums.length){
            while(j<nums.length){
                if(nums[i]>nums[j]){
                    swap(nums,i,j);
                }
                j+=2;
            }
            i+=2;
            j=i+2;
        }

        i=1;
        j=3;
        while(i<nums.length){
            while(j<nums.length){
                if(nums[i]<nums[j]){
                    swap(nums,i,j);
                }
                j+=2;
            }
            i+=2;
            j=i+2;
        }
        return nums;
    }
}
