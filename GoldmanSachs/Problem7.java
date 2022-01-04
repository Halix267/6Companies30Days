class Solution
{  
    int mod = 1000000007;
    int[] dp;
    public int CountWays(String str)
    {
        // code here
        int n = str.length();
        if(str.length()==0) return 0;
        dp = new int[n+1];
       Arrays.fill(dp,-1);
       return helper(str,0,n)%mod;
    }
    
    public int helper(String s,int i,int n){
        if(i==n){
            return 1;
            
        }
        if(s.charAt(i)=='0') return 0;
        if(dp[i]!=-1) return dp[i]%mod;
        
        int way1 = helper(s,i+1,n);
        int way2=0;
        if(i<n-1 && Integer.parseInt(s.substring(i,i+2))<=26){
            way2 = helper(s,i+2,n);
        }
        
        return dp[i] = (way1+way2)%mod;
    }
    
    
}
