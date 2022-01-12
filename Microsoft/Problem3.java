class GFG
{
    static void rotate(int matrix[][]) 
    {
        // Code Here
        
        //transpose the matrix
        
        // reverse rows of the matrix
        
        //1. Transpose
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        
        
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        
        int ii=0;
        int jj = n-1;
        
        while(ii<jj){
            
            int[] tmp = matrix[ii];
            matrix[ii] = matrix[jj];
            matrix[jj] = tmp;
            ii++;
            jj--;
        }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
                
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
}
