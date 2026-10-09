class Solution {
    public void rotate(int[] nums, int k) {
        /*int i=0;
        int arr[]=new int[nums.length];
        k=k%nums.length;
        while(i<nums.length){
            arr[(i+k)%nums.length]=nums[i];
            i++;
        }
      for(int j=0;j<nums.length;j++)
      nums[j]=arr[j];*/
      k=k%nums.length;
      int i=0;
      int j=nums.length-1;
      while(i<j){
        swap(nums,i,j);
        i++;
        j--;
      }
      i=0;
      j=k-1;
      while(i<j){
          swap(nums,i,j);
        i++;
        j--;
      }
      i=k;
      j=nums.length-1;
      while(i<j){
         swap(nums,i,j);
        i++;
        j--;
      }
    }
public void swap(int[] nums,int i,int j){
    int temp=nums[i];
    nums[i]=nums[j];
    nums[j]=temp;
}
    
}