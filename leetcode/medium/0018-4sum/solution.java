class Solution{
    public List<List<Integer>> fourSum(int[] nums,int target){
        List<List<Integer>> al=new ArrayList<>();
        Set<List<Integer>> hs=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        hs.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                    }
                    else if(sum<target)
                        k++;
                    else l--;
                }
            }
        }
        

        al.addAll(hs);
        return al;
    }
}