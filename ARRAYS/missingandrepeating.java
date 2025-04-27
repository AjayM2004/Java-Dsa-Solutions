class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        int[] hash = new int[n+1];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            hash[arr[i]]++;
        }
        int missing = -1;
        int repeating = -1;
        for(int i=1;i<=n;i++)
        {
            if(hash[i]==2)
            {
              repeating = i;  
            }
            if(hash[i]==0)
            {
              missing = i;
            }
            if(missing!=-1 && repeating!=-1)
            {
                break;
            }
        }
        list.add(repeating);
        list.add(missing);
        return list;
    }
}
