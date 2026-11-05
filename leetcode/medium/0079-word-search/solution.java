class Solution {
    boolean ans;
void fun(int i,int j,char[][] s,String w,int idx){
    if(idx>=w.length()) {
        ans=true ;
        return;}
    if(i<0 || j<0 || i>=s.length || j>=s[0].length) return;
    if(ans==true) return ;
    if(s[i][j]!=w.charAt(idx)) return ;
    char temp=s[i][j];
    s[i][j]='*';
    fun(i+1,j,s,w,idx+1);
    fun(i,j+1,s,w,idx+1);
    fun(i-1,j,s,w,idx+1);
    fun(i,j-1,s,w,idx+1);
    s[i][j]=temp;
 }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0))
                fun(i,j,board,word,0);
                if(ans==true) return true;
            }
        } 
    return false;  
    }
}
