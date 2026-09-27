class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch!=')'){
                st.push(ch);
            }
            else{
                String x="";

                while(!st.isEmpty() && st.peek()!='(')
                    x=x+st.pop();

                st.pop();

                for(int j=0;j<x.length();j++)
                    st.push(x.charAt(j));
            }
        }

        String ans="";
        while(!st.isEmpty())
            ans=st.pop()+ans;

        return ans;
    }
}