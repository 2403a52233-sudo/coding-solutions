import java.util.*;

class Solution {
    public int sumCounts(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                HashSet<Integer> hs=new HashSet<>();
                for(int k=i;k<=j;k++){
                    hs.add(nums[k]);
                }
                sum=(int)((sum+(long)hs.size()*hs.size())%1000000007);
            }
        }
        return sum;
    }
}