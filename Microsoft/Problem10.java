class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return MAX(arr,0,dp);
    }
    
    public int MAX(int[] a,int n,int[] dp){
        
        if(n>=a.length) return 0;
        if(dp[n]!=-1) return dp[n];
        int k = MAX(a,n+1,dp);
        int m = a[n]+MAX(a,n+2,dp);
        return dp[n] = Math.max(k,m);
    }
}
