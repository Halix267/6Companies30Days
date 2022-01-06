class Solution {
    static int[][] dp;
    static int maxProfit(int K, int N, int A[]) {
        // code here
        //dp
       int n = A.length;
        dp = new int[n+1][K+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(A,0,K);
    }
    static int helper(int[] a,int i,int k){
        
        if(k==0) return 0;
        
        if(i==a.length) return 0;
        if(dp[i][k]!=-1) return dp[i][k];
        
        int max=  helper(a,i+1,k);
        
        for(int j=i;j<a.length;j++){
            
            if(a[j]<a[i])continue;
            max = Math.max(max,a[j]-a[i]+ helper(a,j+1,k-1));
        }
        
        return dp[i][k] =max;
    }
}
