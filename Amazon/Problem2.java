class Solution {
    public int longestMountain(int[] nums) {
        int n = nums.length;
        int[] lis = new int[n];
        int[] lds = new int[n];
        Arrays.fill(lds,1);
        Arrays.fill(lis,1);
        for(int i=1;i<n;i++){
            
            if(nums[i]>nums[i-1]){
                lis[i] = lis[i-1]+1;
            }
        }
        int lbs = 0;
        for(int i=n-2;i>=0;i--){
            
            int max = 1;
            if(nums[i]>nums[i+1]){
                lds[i] = lds[i+1]+1;
            }
            
        }
        
        for(int i=0;i<n;i++){
            if(lis[i]>1 && lds[i]>1){
                lbs = Math.max(lbs,lis[i]+lds[i]-1);
            }
        }
        return lbs;
    }
}
