class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        // Sliding Window maximum
        
        int i=0;
        int j=0;
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> q = new ArrayDeque<>();
        
        while(j<n){
            
            while(!q.isEmpty() && q.peekLast()<arr[j]){
                q.pollLast();
            }
            q.addLast(arr[j]);
            if((j-i+1)<k){
                
                j++;
               continue;
               
            }
            
            if((j-i+1)==k){
                ans.add(q.peekFirst());
                if(arr[i]==q.peek()){
                    q.pollFirst();
                }
                
                i++;
                j++;
               
            }
            
        }
        return ans;
    }
}
