class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Node temp1 = head;
        while(temp1!=null)
        {
            Node temp2=temp1.next;
           
            while(temp2!=null && (temp1.data+temp2.data)<=target)
            {
                ArrayList<Integer> temp = new ArrayList<>();
                if((temp1.data+temp2.data)==target)
                {
                    temp.add(temp1.data);
                    temp.add(temp2.data);
                    list.add(temp);
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
           
        }
        return list;
    }
}
        
