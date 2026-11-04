class Solution {
    public int reverse(int n) {
    long rem=0;
     long rev=0;
     while(n!=0){
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
     }
  if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE) return 0;
  return (int)rev;
    }
}