class Solution {
    public int orangesRotting(int[][] grid) {
        
        
        Queue<int[]>q = new LinkedList<>();
        int n = grid.length;
        int m  = grid[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
            }
        }
        
        int[] dx = {-1,0,1,0};
        int[] dy={0,1,0,-1};
        int ans=0;
        while(!q.isEmpty()){
            int sze = q.size();
            boolean flag = false;
            for(int ii=0;ii<sze;ii++){
                 int[] tmp = q.poll();
            
                for(int i=0;i<4;i++){

                    int x = tmp[0]+dx[i];
                    int y = tmp[1]+dy[i];
                    if(x>=0 && x<n && y>=0 && y<m && grid[x][y]==1){
                        grid[x][y]=2;
                        flag=true;
                        q.add(new int[]{x,y});
                    }
                }
            }
           
            if(flag) ans++;
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1) return -1;
            }
        }
        return ans;
    }
}
