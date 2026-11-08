class Solution {
    public int maximum69Number (int num) {
        int rem=0;
        int rev=0;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        int rem2=0;
        int ans=0;
        int c=0;
        while(rev!=0){
            rem2=rev%10;
            if(rem2==6 && c==0){
                rem2=rem2+3;
                c++;
            }
            ans=ans*10+rem2;
            rev=rev/10;
        }
    return ans;
    }
}