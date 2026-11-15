class Solution {
    public int numOfSubarrays(int[] arr) {
      int prev[]=new int[arr.length+1];
      int even=1;
      int odd=0;
      for(int i=0;i<arr.length;i++){
        prev[i+1]=prev[i]+arr[i];
        if(prev[i+1]%2==0) even++;
        else odd++;
      }
    return (int)((long)even*odd%1000000007);
    }
}