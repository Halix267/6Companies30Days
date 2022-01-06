//O(nlogk)
class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> ans=  new ArrayList<>();
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       
        
        int i=0;int j=0;
        
        while(j<n){
            if(pq.size()<k){
                pq.add(arr[j]);
            }
            
            if(pq.size()==k){
                ans.add(pq.peek());
                pq.remove(arr[i]);
                i++;
            }
            j++;
        }
        return ans;
    }
}
