class Solution {
    public int compress(char[] chars) {
        int i=0;
        int j=0;
        int c=0;
        String s="";
        while(j<chars.length){
            if(chars[i]==chars[j]){
                c++;
                j++;
            }
            else{
                s+=chars[i];
                if(c>1)
                    s+=c;
                    c=1;
                    i=j;
                    j++;
                
            }
            
        }
        s+=chars[i];
        if(c>1)
        s+=c;
     
        for(int k=0;k<s.length();k++){
            chars[k]=s.charAt(k);
        }
    
       return s.length();
    }
}
