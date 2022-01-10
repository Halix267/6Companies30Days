class Solution{
    static int ind=65;
    static String ans="";
    static String matrixChainOrder(int p[], int n){
        // code here
        int dp[][]=new int[n][n]; //0 index is dummy index 
		    //int bracket[][]=new int[n][n];
		    for(int i=1;i<n;i++)
		    dp[i][i]=0; // one length . dp[i][j] means ai * ai+1 * ... aj minimum multi
		    for(int l=2;l<n;l++){
		        for(int i=1;i<n-l+1;i++){
		            int j=i+l-1;
		            dp[i][j]=Integer.MAX_VALUE;
		            for(int k=i;k<j;k++)//k is a partition or bracket
		            {
		                int te=dp[i][k]+dp[k+1][j]+(p[i-1]*p[j]*p[k]);
		                if(te<dp[i][j]){
		                    dp[i][j]=te;
		                    dp[j][i]=k;
		                }
		            }
		        }
		    }
		    ind=65;
		    print(1,n-1,dp,new StringBuilder());
		    return ans;
		    
    }
    
    static void print(int i,int j,int dp[][],StringBuilder sb){
        if(i==j){
            sb.append((char)ind++);
            ans =sb.toString();
            return;
        }
        sb.append("(");
        print(i,dp[j][i],dp,sb);
        
        print(dp[j][i]+1,j,dp,sb);
        sb.append(")");
    }
}
