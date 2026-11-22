class Solution {
    void fun(ArrayList<ArrayList<Integer>> adj, boolean vis[], ArrayList<Integer> al,int start){
        if(vis[start]) return;
        vis[start]=true;
        al.add(start);
        for(int i:adj.get(start)) fun(adj,vis,al,i);
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        if(adj.size()==0) return al;
        boolean vis[]=new boolean[adj.size()];
        fun(adj,vis,al,0);
        return al;
    }
}