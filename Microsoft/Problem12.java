class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] a, int k) {
        // code here
        Set<ArrayList<Integer>>  ans = new HashSet<>();
        Arrays.sort(a);
        int n = a.length;
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
               
               int l = j+1;
               int m = n-1;
               while(l<m){
                   if(a[i]+a[j]+a[l]+a[m]==k){
                       ArrayList<Integer> ll = new ArrayList<>();
                       ll.add(a[i]);ll.add(a[j]);ll.add(a[l]);ll.add(a[m]);
                       ans.add(ll);
                       l++;
                       m--;
                   }else if(a[i]+a[j]+a[l]+a[m]<k){
                       l++;
                   }else {
                       m--;
                   }
               }
               
                
                
            }
        }
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>(ans);
        
        
        
        Collections.sort(res,(x,y)->{
            if(x.get(0)==y.get(0)){
                if(x.get(1)==y.get(1)){
                    if(x.get(2)==y.get(2)){
                        return x.get(3)-y.get(3);
                    }
                    else return x.get(2)-y.get(2);
                }else return x.get(1)-y.get(1);
            }
            else return x.get(0)-y.get(0);
        });
       
        return res;
    }
}
