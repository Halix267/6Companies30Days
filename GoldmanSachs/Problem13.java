class Solution{
    static String decodedString(String s){
        // code here
        int n=s.length();
        return solve(s,n,0);
    }
     
    static String solve(String s,int n,int i){
        String ans = "";
        int num = 0;
        while(i<n){
            
            char c = s.charAt(i);
            if(c>='0' && c<='9'){
                num = num * 10 + (c - '0');
            }
            else if(c == '['){
                i++;
                String temp = solve(s,n,i);
               // System.out.println(temp+" "+num);
                while(num>0)  {  
                    ans += temp;
                    num--;
                }
                num = 0;
            }
            else if(c== ']'){
                return ans;
            }
            else{
                ans += c;
               
            }
            i++;
            
        }
        return ans;
    }    

}
