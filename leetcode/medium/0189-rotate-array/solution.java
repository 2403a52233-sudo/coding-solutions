class Solution {
    public void rotate(int[] nums, int k) {
        int i=0;
        int arr[]=new int[nums.length];
        k=k%nums.length;
        while(i<nums.length){
            arr[(i+k)%nums.length]=nums[i];
            i++;
        }
      for(int j=0;j<nums.length;j++)
      nums[j]=arr[j];
 
        
    }
}