class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        
        //Nearest Greatest to left;
        
        int[] ans = new int[n];
        
        Stack<int[]> st = new Stack<>();
        st.push(new int[]{price[0],0});
        ans[0]=1;
        
        for(int i=1;i<n;i++){
            
           while(!st.isEmpty()){
               int[] tmp = st.peek();
               if(price[i]>=tmp[0]){
                   st.pop();
               }else break;
           }
           
           if(st.isEmpty()){
               ans[i] = i+1;
           }
           else{
               int[] tmp = st.peek();
               ans[i]= i-tmp[1];
           }
           st.push(new int[]{price[i],i});
        }
        return ans;
    }
    
}
