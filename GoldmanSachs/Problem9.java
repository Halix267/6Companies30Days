class Solution{
    static String printMinNumberForPattern(String s){
        // code here
        int n = s.length();
        int m = n+1;
    String ans="";
       Stack<Integer> st = new Stack<>();
       int num=1;
        
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='D'){
                st.push(num);
                num++;
            }else{
                st.push(num);
                num++;
                
                while(!st.isEmpty()){
                    
                    ans+=(st.pop()+"");
                }
            }
        }
        st.push(num);
        while(!st.isEmpty()){
           ans+=(st.pop()+""); 
        }
        return ans;
    }
    
    
   
}
