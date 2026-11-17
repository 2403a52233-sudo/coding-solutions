class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {

        int adj[][]=new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                adj[i][j]=-1;
            }
        }

        for(int i=0;i<times.length;i++){
            int u=times[i][0];
            int v=times[i][1];
            int w=times[i][2];

            adj[u][v]=w;
        }

        int dist[]=new int[n+1];
        boolean vis[]=new boolean[n+1];

        for(int i=1;i<=n;i++)
            dist[i]=Integer.MAX_VALUE;

        dist[k]=0;

        for(int i=1;i<=n;i++){

            int u=-1;
            int min=Integer.MAX_VALUE;

            for(int j=1;j<=n;j++){
                if(!vis[j] && dist[j]<min){
                    min=dist[j];
                    u=j;
                }
            }

            if(u==-1) break;

            vis[u]=true;

            for(int j=1;j<=n;j++){
                if(adj[u][j]!=-1 && !vis[j]){
                    if(dist[u]+adj[u][j]<dist[j]){
                        dist[j]=dist[u]+adj[u][j];
                    }
                }
            }
        }

        int ans=0;

        for(int i=1;i<=n;i++){
            if(dist[i]==Integer.MAX_VALUE)
                return -1;

            ans=Math.max(ans,dist[i]);
        }

        return ans;
    }
}