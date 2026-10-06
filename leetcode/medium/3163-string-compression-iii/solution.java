class Solution{
    public String compressedString(String word){
        int i=0;
        int j=0;
        int c=0;
        String s="";
        while(j<word.length()){
            if(word.charAt(i)==word.charAt(j)&&c<9){
                c++;
                j++;
            }
            else{
                s+=c;
                s+=word.charAt(i);
                c=0;
                i=j;
            }
        }
        s+=c;
        s+=word.charAt(i);
        return s;
    }
}