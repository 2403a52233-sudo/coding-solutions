class Solution{
    public int countPrimes(int n){
        if(n<=2)
            return 0;

        int d=1;

        for(int j=3;j<n;j+=2){
            boolean prime=true;

            for(int i=3;i*i<=j;i+=2){
                if(j%i==0){
                    prime=false;
                    break;
                }
            }

            if(prime)
                d++;
        }

        return d;
    }
}