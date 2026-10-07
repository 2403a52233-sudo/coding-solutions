class Solution {
    public void duplicateZeros(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int i=0;
        while(i<arr.length && st.size()<arr.length){
            st.push(arr[i]);
            if(arr[i]==0 && st.size()<arr.length)
                st.push(0);
                i++;
        }
        i=0;
        for(int x:st){
        arr[i]=x;
        i++;}
    }
}