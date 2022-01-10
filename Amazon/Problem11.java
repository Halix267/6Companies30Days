
class Tree 
{
    //Function to serialize a tree and return a list containing nodes of tree.
	public void serialize(Node root, ArrayList<Integer> A) 
	{
	    //code here
	    if(root==null) return;
	    
	    serialize(root.left,A);
	    A.add(root.data);
	    serialize(root.right,A);
	}
	
	//Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A)
    {
        //code here
        return FormTree(A,0,A.size()-1);
        
    }
    
    public Node FormTree(ArrayList<Integer> l,int i,int j){
        
        if(i>j) return null;
        
        int mid = (i+j)/2;
        
        Node root = new Node(l.get(mid));
        root.left = FormTree(l,i,mid-1);
        root.right = FormTree(l,mid+1,j);
        return root;
     
    }
};
