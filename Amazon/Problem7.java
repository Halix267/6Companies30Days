
class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        int[] a = new int[26];
        int n = A.length();
        char ch[] = new char[n];
       Queue<Character>q = new LinkedList<>();
        for(int i=0;i<n;i++){
            
            char c = A.charAt(i);
            a[c-'a']++;
            if(a[c-'a']==1){
                q.add(c);
                
            }
            while(!q.isEmpty() && a[q.peek()-'a']!=1){
                q.poll();
            }
            if(q.isEmpty()){
                ch[i] ='#';
            }else{
                ch[i] = q.peek();
            }
        }
        
        return new String(ch);
    }
}
