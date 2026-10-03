class Solution {
    public int longestValidParentheses(String s) {
        int max=0;
        int oc=0;
        int cc=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                oc++;
            else
                cc++;

            if(oc==cc)
                max=Math.max(max,oc+cc);
            else if(cc>oc){
                oc=0;
                cc=0;
            }
        }

        oc=0;
        cc=0;

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='(')
                oc++;
            else
                cc++;

            if(oc==cc)
                max=Math.max(max,oc+cc);
            else if(oc>cc){
                oc=0;
                cc=0;
            }
        }

        return max;
    }
}