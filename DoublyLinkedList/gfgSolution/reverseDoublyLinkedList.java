class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        Stack<Integer> stack = new Stack<>();
        DLLNode temp = head;
        while(temp!=null)
        {
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null)
        {
            temp.data = stack.pop();
            temp = temp.next;
        }
        return head;
    }
}
