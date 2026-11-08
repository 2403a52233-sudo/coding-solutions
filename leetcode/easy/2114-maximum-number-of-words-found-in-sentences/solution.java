class Solution {
    public int mostWordsFound(String[] s) {
        int max=0;
        for(int i=0;i<s.length;i++){
            String arr[]=s[i].split(" ");
            if(arr.length>max) max=arr.length;
        }
        return max;
    }
}