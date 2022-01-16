class Solution{
    static int minSteps(int D){
        // code here
        //TLE 
        // Queue<int[]>q = new LinkedList<>();
        // q.add(new int[]{0,1});
        // int ans=0;
        // while(!q.isEmpty()){
        //     int[] tmp= q.poll();
        //     if(tmp[0]==D){
        //         ans = tmp[1]-1;
        //         break;
        //     }
            
        //     q.add(new int[]{tmp[0]+tmp[1],tmp[1]+1});
        //     q.add(new int[]{tmp[0]-tmp[1],tmp[1]+1});
        // }
        // return ans;
        
        
        int step=1;
        int jump=0;
        
        while(jump<D || (jump-D)%2!=0){
            jump+=step;
            step++;
        }
        return step-1;
    }
    
    
}
