class Solution
{
    static ArrayList<String> ans = new ArrayList<>();
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here
        
        Generate(a,0,N,new StringBuilder());
        //System.out.println(ans);
        return ans;
    }
    
    static void Generate(int[] a,int i,int N,StringBuilder sb){
        
        if(sb.length()==N){
            ans.add(sb.toString());
            return;
        }
        
        for(int dig = i;dig<N;dig++){
            String s = GET(a[dig]);
            for(int k=0;k<s.length();k++){
                
                sb.append(s.charAt(k));
                Generate(a,dig+1,N,sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
    
    static String GET(int n){
        
        switch(n){
            case 2:return "abc";
            case 3: return "def";
            case 4:return "ghi";
            case 5: return "jkl";
            case 6:return "mno";
            case 7: return "pqrs";
            case 8:return "tuv";
            case 9: return "wxyz";
            
        }
        return "";
    }
}
