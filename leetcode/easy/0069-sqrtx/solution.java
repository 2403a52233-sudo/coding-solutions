class Solution {
    public int mySqrt(int x) {
        int i=1;
        int j=x;

        while(i<=j){
            long m=i+(j-i)/2;

            if(m*m==x)
                return (int)m;
            else if(m*m<x)
                i=(int)m+1;
            else
                j=(int)m-1;
        }

        return j;
    }
}