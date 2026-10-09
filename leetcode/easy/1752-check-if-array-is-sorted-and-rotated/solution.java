class Solution {
    public boolean check(int[] nums) {
        int i=0;
        int j=1;
        int c=0;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]>nums[j]){
                c++;}
                j++;
            }  
        if(nums[0]<nums[nums.length-1]) 
            c++;     
        if(c>1)return false;
        return true;
        
    }
}