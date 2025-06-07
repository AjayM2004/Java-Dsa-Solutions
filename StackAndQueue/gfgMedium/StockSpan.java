
class Solution {
    static int[] previousGreaterElement(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] pge = new int[n];
        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty() && arr[i]>=arr[stack.peek()])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                pge[i] = -1; 
            }
            else
            {
                pge[i] = stack.peek();
            }
            stack.push(i);
        }
        return pge;
    }
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int[] pge = previousGreaterElement(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            list.add(i - pge[i]);
        }
        return list;
    }
}
