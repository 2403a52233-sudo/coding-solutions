class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length-1;
        int j=nums.length-2;
        int c=1;

        while(j>=0){
            if(nums[i]!=nums[j]){
                c++;
                i=j;
                if(c==3) return nums[i];
                j--;
            }
            else{
                j--;
            }
        }
        return nums[nums.length-1];
    }
}