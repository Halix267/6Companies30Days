class Solution {
    
    long getNthUglyNo(int n) {
        // code here
        
      TreeSet<Long> set = new TreeSet<>();
      
      set.add(1l);
      
      for(int i=1;i<n;i++){
          
          long t  = set.pollFirst();
          set.add(2*t);
          set.add(3*t);
          set.add(5*t);
      }
      
      return set.pollFirst();
        
    }
}
