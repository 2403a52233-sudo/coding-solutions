class Solution {
    public boolean canWinNim(int n) {
        if(n<=3) return true;
        else if(n%3==0) return true;
        else if(n%2==0) return true;
        else if(n%2!=0) return true;

    return false; 
    }
}