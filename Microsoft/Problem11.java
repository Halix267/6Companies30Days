class solve{
    
    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int N)
    {
        // Your code here
        ArrayList<String> ans = new ArrayList<>();
        for(int i=1;i<=N;i++){
            ans.add(Integer.toBinaryString(i));
        }
        
        return ans;
    }
    
}
