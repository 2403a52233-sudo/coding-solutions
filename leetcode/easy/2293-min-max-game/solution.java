class Solution {
    public int minMaxGame(int[] nums) {
        int n=nums.length;
        while(n>1){
        int arr[]=new int[n/2];int i=0;
        while(i<n/2){
            if(i%2==0)
            arr[i]=Math.min(nums[2*i],nums[2*i+1]);
            else
            arr[i]=Math.max(nums[2*i],nums[2*i+1]);
            i++;
        }
        nums=arr;
        n=n/2;
        }
        return nums[0];
    }
}