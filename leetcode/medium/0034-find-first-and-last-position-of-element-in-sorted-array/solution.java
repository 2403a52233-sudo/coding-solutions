class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int first=-1;
        int last=-1;

        while(i<nums.length){
            if(nums[i]==target){
                first=i;
                break;}
            else
                i++;
        }

        while(j>=0){
            if(nums[j]==target){
                last=j;
                break;}
            else
                j--;
        }

        return new int[]{first,last};
    }
}