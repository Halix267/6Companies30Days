class Solution
{
    //Function to connect nodes at same level.
    public void connect(Node root)
    {
        // Your code goes here.
        //bfs
         if(root==null) return;
         Queue<Node> q = new LinkedList<>();
         q.add(root);
         
         while(!q.isEmpty()){
             List<Node> l = new ArrayList<>();
             int sze = q.size();
             
             for(int i=0;i<sze;i++){
                 Node tmp = q.poll();
                 l.add(tmp);
                 if(tmp.left!=null){
                     q.add(tmp.left);
                     
                 }
                 if(tmp.right!=null){
                     q.add(tmp.right);
                 }
             }
             
             for(int i=1;i<l.size();i++){
                 Node l1= l.get(i-1);
                 Node l2 = l.get(i);
                 l1.nextRight=l2;
             }
            // System.out.println(l);
         }
    }
}
