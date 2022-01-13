class Solution
{
    //Function to find unit area of the largest region of 1s.
    int ans =0;
    boolean[][] vis;
    int[] dx = {0,-1,-1,-1,0,1,1,1};
    int[] dy = {1,1,0,-1,-1,-1,0,1};
    public int findMaxArea(int[][] grid)
    {
        // Code here
        // longest connected component in graph
        int n = grid.length;
        int m = grid[0].length;
        vis = new boolean[n+1][m+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                if(grid[i][j]==1){
                    if(!vis[i][j]){
                        List<Integer> l = new ArrayList<>();
                        dfs(grid,i,j,n,m,l);
                        ans = Math.max(ans,l.size());
                    }
                }
            }
        }
        return ans;
    }
    
    public void dfs(int[][] grid,int ii,int jj,int n,int m,List<Integer>l){
        vis[ii][jj] = true;
        l.add(grid[ii][jj]);
        
        for(int j=0;j<8;j++){
            int x = ii+dx[j];
            int y = jj+dy[j];
                    
            if(x>=0 && x<n && y>=0 && y<m && !vis[x][y] && grid[x][y]==1){
                     dfs(grid,x,y,n,m,l);   
            }
        }
        
    
    }
}
