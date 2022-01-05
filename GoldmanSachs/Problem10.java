class Solution {
    public List<Integer> findMax10(int[] nums) {
        // Code here
     PriorityQueue<Integer> pq = new PrirorityQueue<>(Collections.reverseOrder());
     
     for(int i:nums){
         pq.add(i);
         if(pq.size()==10) pq.poll();
     }
      List<Integer> l = new ArrayList<>();
      while(!pq.isEmpty()){
        l.add(pq.poll());
      }
     return l;
    }
}
