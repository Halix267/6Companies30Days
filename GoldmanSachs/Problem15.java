class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
     int[] cnt = new int[k];
        for(int i:nums)
            cnt[i%k]++;
        
        if(cnt[0]%2!=0)
            return false;
        int i=1,j = k-1;
        while(i<j) {
            if(cnt[i] != cnt[j])
                return false;
            i++;
            j--;
        }
        
        if(i==j && cnt[i]%2!=0){
            return false;
        }
        return true;
    }
}
