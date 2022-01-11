class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        // your code here
        //Node tmp = head;
        int a=0;
        int b=0;
        
        while(head!=null){
        
            
            Node curr=null;
            
            a++;
            if(a==M){
                curr = head.next;
                while(curr!=null && b<N){
                    curr = curr.next;
                    b++;
                }
                head.next = curr;
                a=0;
                b=0;
            }
            //System.out.println(tmp.data);
            
            //if(curr!=null)head = curr;
            
            head = head.next;
 
            
        }
       
       
    }
}
