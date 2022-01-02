class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        Map<String,List<String>> map = new HashMap<>();
        
        for(String s:string_list){
            
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String tmp = new String(ch);
            if(map.containsKey(tmp)){
                List<String> l= map.get(tmp);
                l.add(s);
                map.put(tmp,l);
            }else{
                 List<String> l= new ArrayList<>();
                l.add(s);
                map.put(tmp,l);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(String s:map.keySet()){
            ans.add(map.get(s));
        }
        //System.out.println(map);
        return ans;
    }
}
