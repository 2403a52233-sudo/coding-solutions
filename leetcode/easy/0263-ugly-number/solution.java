class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
    for(int i=2;i<=n;i++){
    if(n%i==0){
        if(i!=2 && i!=3 && i!=5)
            return false;
    }
    }
    
    return true;
        
    }
}