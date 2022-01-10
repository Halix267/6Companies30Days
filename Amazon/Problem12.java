class Solution
{
    String colName (long n)
    {
        // your code here
        
        StringBuilder sb = new StringBuilder();
        
        while(n>0){
            
            int rem = (int)n%26;
            
            if(rem>0){
                sb.append((char)(rem-1+'A'));
                n/=26;
            }else{
                sb.append('Z');
                n=n/26-1;
            }
            
        }
        return sb.reverse().toString();
    }
}
