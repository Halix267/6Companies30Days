class Solution{
    static ArrayList<ArrayList<String>> displayContacts(int n, 
                                        String contact[], String s)
    {
        // code here
        
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        
        String tmp ="";
      //  int n = contact.length;
        for(int i=0;i<s.length();i++){
            tmp+=s.charAt(i);
            
            Set<String> set = new TreeSet<>();
            
            for(int j=0;j<n;j++){
                int ind = contact[j].indexOf(tmp);
                if(ind==0){
                    set.add(contact[j]);
                }
                
                
            }
            if(set.size()==0){
                ArrayList<String> l = new ArrayList<>();
                l.add("0");
                ans.add(l);
            }
            else{
                ArrayList<String> l = new ArrayList<>();
                for(String ss:set){
                    
                l.add(ss);
                
                }
                ans.add(l);
            }
        }
        return ans;
    }
    
}
