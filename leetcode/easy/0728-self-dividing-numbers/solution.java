class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> al=new ArrayList<>();
         int rem=0;
        for(int i=left;i<=right;i++){
            int n=i;
            while(n!=0){
                rem=n%10;
                if(rem==0 || i%rem!=0)
                    break;
                n/=10;
            }
        if(n==0) al.add(i);
        }
    return al;
    }
}
      