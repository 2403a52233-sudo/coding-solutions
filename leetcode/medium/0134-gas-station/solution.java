class Solution {
    public int canCompleteCircuit(int[] gas,int[] cost) {
        int g=0;
        int c=0;
        int st=0;
        int t=0;
        for(int i=0;i<gas.length;i++){
            g+=gas[i];
            c+=cost[i];
            t=t+gas[i]-cost[i];
            if(t<0){
                st=i+1;
                t=0;
            }
        }
        if(g<c)
            return -1;
        return st;
    }
}