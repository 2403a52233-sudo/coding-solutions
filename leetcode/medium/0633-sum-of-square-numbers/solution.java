class Solution {
    public boolean judgeSquareSum(int c) {
        int nums[]=new int[c+1];
        for(int i=0;i<c;i++)
            nums[i]=i;
        int i=0;
        int j=1;
        while(j<c){
            if((long)(nums[i]*nums[i])+(nums[j]*nums[j])==c){
                return true;
            }
            j++;
            if(j==c){
                i++;
                j=i+1;
            }
            
        }
    return false;  
    }
}