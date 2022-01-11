class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    
    public static int minTime(Node root, int target) 
    {
        // Your code goes here
        // similar like rotten oranges
        
        Map<Node,Node> par = new HashMap<>();
        
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        Node start = null;
        while(!q.isEmpty()){
            int sze = q.size();
            for(int i=0;i<sze;i++){
                Node tmp = q.poll();
                if(tmp.data==target){
                    start = tmp;
                }
                if(tmp.left!=null){
                    par.put(tmp.left,tmp);
                    q.add(tmp.left);
                }
                
                if(tmp.right!=null){
                    par.put(tmp.right,tmp);
                    q.add(tmp.right);
                }
            }
        }
        Map<Node,Integer> vis = new HashMap<>();
        int ans = BurnTree(par,start,vis);
       
        return ans;
    }
    
    static int BurnTree(Map<Node,Node> par,Node start,Map<Node,Integer> vis){
        
        int ans=0;
        
        Queue<Node> q = new LinkedList<>();
        q.add(start);
        //System.out.println(q);
        while(!q.isEmpty()){
            
            boolean flag = false;
            int sze = q.size();
            for(int i=0;i<sze;i++){
                Node tmp = q.poll();
                if(tmp.left!=null && vis.get(tmp.left)==null){
                    flag = true;
                    q.add(tmp.left);
                    vis.put(tmp.left,1);
                }
                if(tmp.right!=null && vis.get(tmp.right)==null){
                    flag = true;
                    q.add(tmp.right);
                    vis.put(tmp.right,1);
                }
                if(par.get(tmp)!=null && vis.get(par.get(tmp))==null){
                    flag = true;
                    q.add(par.get(tmp));
                    vis.put(par.get(tmp),1);
                }
            }
            if(flag) ans++;
        }
        return ans;
        
    }
}
