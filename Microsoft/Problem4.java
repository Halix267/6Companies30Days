class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> ans = new ArrayList<>();
        
        int left=0,right=c-1,top=0,bottom=r-1;
        
        while(left<=right && top<=bottom){
            
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            
            for(int i=right;i>=left;i--){
                ans.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                ans.add(matrix[i][left]);
            }
            left++;
        }
        
        while(ans.size()!=r*c){
            ans.remove(ans.size()-1);
        }
        return ans;
    }
    
}
