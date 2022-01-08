class Solution{
    static int isValid(int matrix[][]){
        // code here
        int n = matrix.length;
        int m = matrix[0].length;
        boolean isValid = true;
        for(int i=0;i<n;i++){
            Set<Integer> set = new HashSet<>();
            boolean flag = false;
            for(int j=0;j<m;j++){
                if(matrix[i][j]!=0 && set.contains(matrix[i][j])){
                    isValid=false;
                    flag = true;
                    break;
                }
                if(matrix[i][j]!=0) set.add(matrix[i][j]);
            }
            if(flag) break;
        }
        for(int i=0;i<m;i++){
            Set<Integer> set = new HashSet<>();
            boolean flag = false;
            for(int j=0;j<n;j++){
                if(matrix[j][i]!=0 && set.contains(matrix[j][i])){
                    isValid=false;
                    flag = true;
                    break;
                }
                if(matrix[j][i]!=0) set.add(matrix[j][i]);
            }
            if(flag) break;
        }
         for(int i=0;i<9;i+=3){
            
            boolean flag = false;
            for(int j=0;j<9;j+=3){
                Set<Integer> set = new HashSet<>();
                for(int k=i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){
                        
                        if(matrix[k][l]!=0 && set.contains(matrix[k][l])){
                                isValid=false;
                                flag = true;
                                break;
                            }
                            if(matrix[k][l]!=0) set.add(matrix[k][l]);
                    }
                    
                }
            }
            if(flag) break;
        }
        if(isValid) return 1;
        return 0;
    }
    
    
}
