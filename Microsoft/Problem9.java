class Tree
{
    //Function to count number of subtrees having sum equal to given sum.
    int ans=0;
    int countSubtreesWithSumX(Node root, int X)
    {
	//Add your code here.
	   
	   FindSum(root,X);
	   return ans;
    }
    
    int FindSum(Node root,int target){
        
        if(root==null) return 0;
        
        int l = FindSum(root.left,target);
        int r = FindSum(root.right,target);
        if(root.data+l+r==target){
            ans++;
        }
        return root.data+l+r;
    }
}

