class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        int p[]={2,3,5};
    for(int i=0;i<=2;i++){
        while(n%p[i]==0)
        n=n/p[i];
        }
        return n==1;
        
    }
}