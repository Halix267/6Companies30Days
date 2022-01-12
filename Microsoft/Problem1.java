class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    long sum =0;
	    for(int i=0;i<n;i++)sum+=arr[i];
	   
	   int[][] dp = new int[n+1][(int)sum+1];
	   
	   for(int i=0;i<=n;i++){
	       Arrays.fill(dp[i],-1);
	   }
	   
	   return helper(dp,arr,0,sum,n-1);
	    
	    
	    
	    
	} 
	
	public int helper(int[][] dp,int[] a,int sum,long t,int n){
	    
	    
	    if(n==0){
	        return (int)Math.abs(t-2*sum);
	    }
	    
	    if(dp[n][sum]!=-1) return dp[n][sum];
	    
	    return dp[n][sum]= Math.min(helper(dp,a,sum+a[n],t,n-1),
	                        helper(dp,a,sum,t,n-1));
	}
}
