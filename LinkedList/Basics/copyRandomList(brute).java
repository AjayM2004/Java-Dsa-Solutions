/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        if(head!=null)
        {
            HashMap<Node,Node> map = new HashMap<>();
            Node temp = head;
            while(temp!=null)
            {
                Node newnode = new Node(temp.val);
                map.put(temp,newnode);
                temp = temp.next;
            }
            Node copy = null;
            temp = head;
            while(temp!=null)
            {
                copy = map.get(temp);
                copy.next = map.get(temp.next);
                copy.random = map.get(temp.random);
                temp = temp.next;
            }
            return map.get(head);
        }
        else{
            return head;
        }
    }
}
