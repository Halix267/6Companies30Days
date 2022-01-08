class Solution
{
    //Function to count number of ways to reach the nth stair 
    //when order does not matter.
    Long countWays(int m)
    {
        // your code here
        //enhanced dp
        
        long[] dp = new long[m+1];
        dp[1]=1;
        
        for(int i=2;i<=m;i++){
            if(i%2==0)dp[i] = dp[i-1]+1;
            else dp[i]=dp[i-1];
            //System.out.println(dp[i]+" "+i);
        }
        return dp[m];
    }    
}
