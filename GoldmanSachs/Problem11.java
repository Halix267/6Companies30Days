//Find Missing And Repeating

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
     
        Map<Integer,Integer> map = new HashMap<>();
        int repeated = -1;
        int missing =-1;
        for(int i:arr){
           
            if(map.containsKey(i) && i<=n){
                repeated = i;
            }
             map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int i=0;i<n;i++){
            if(!map.containsKey(i+1)){
                missing=i+1;
                break;
            }
        }
        
        return new int[]{repeated,missing};
    }
}
