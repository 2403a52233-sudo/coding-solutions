class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb=new StringBuilder(s);

        int i=0;
        int j=1;

        while(j<sb.length()){
            if(sb.charAt(i)=='('){
                if(sb.charAt(j)=='('){
                    i=j;
                    j++;
                }
                else if(sb.charAt(j)==')'){
                    rev(sb,i+1,j-1);

                    sb.deleteCharAt(j);
                    sb.deleteCharAt(i);

                    i=0;
                    j=1;
                }
                else{
                    j++;
                }
            }
            else{
                i++;
                j=i+1;
            }
        }

        return sb.toString();
    }

    public void rev(StringBuilder sb,int i,int j){
        while(i<j){
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);

            i++;
            j--;
        }
    }
}