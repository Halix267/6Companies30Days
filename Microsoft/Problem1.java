class Solution {
    public boolean isPossible(int N, int[][] prerequisites)
    {
        // Your Code goes here
        //should not contain cycle
      
      List<List<Integer>> graph = new ArrayList<>();
      for(int i=0;i<N;i++) graph.add(new ArrayList<>());
      for(int[] i:prerequisites){
          graph.get(i[1]).add(i[0]);
      }
      boolean[] vis = new boolean[N];
      
        if(isCycle(N,graph))return false;
      
     
      
      return true;
    }
    
    boolean isCycle(int N,List<List<Integer>> graph){
        
        boolean[] vis = new boolean[N];
        boolean dfsVis[]  = new boolean[N];
        
        for(int i=0;i<N;i++){
            if(!vis[i]){
                if(dfs(i,graph,vis,dfsVis)) return true;
            }
        }
        return false;
       
        
    }
    
    boolean dfs(int v,List<List<Integer>> graph,boolean[] vis,boolean[] dfsVis){
        
        vis[v]=true;
        dfsVis[v]=true;
        for(int child:graph.get(v)){
            if(!vis[child]){
                if(dfs(child,graph,vis,dfsVis)) return true;
            }else if(dfsVis[child]) return true;
        }
        dfsVis[v]=false;
        return false;
        
    }

}
