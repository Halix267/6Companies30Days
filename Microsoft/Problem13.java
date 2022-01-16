
class Solution
{
    //Function to find if the given edge is a bridge in graph.
    static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
    {
        // code here
        boolean[] vis = new boolean[V];
        int cnt1=0;
        for(int i=0;i<V;i++){
            
            if(!vis[i]){
                dfs(i,adj,vis);
                cnt1++;
                vis[i] = true;
                
            }
        }
        vis = new boolean[V];
        int cnt2=0;
        adj.get(c).remove(new Integer(d));
        adj.get(d).remove(new Integer(c));
        
       
        for(int i=0;i<V;i++){
            
            if(!vis[i]){
                dfs(i,adj,vis);
                cnt2++;
                vis[i] = true;
                
            }
        }
       
        return cnt1!=cnt2?1:0;
    }
    
    static void dfs(int v,ArrayList<ArrayList<Integer>> adj,boolean[] vis){
        
        vis[v]=true;
        
        for(int child:adj.get(v)){
            if(!vis[child]){
                //vis[child]=true;
                dfs(child,adj,vis);
            }
        }
    }
}
