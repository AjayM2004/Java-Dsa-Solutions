class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        int n = arr.length;
        int maxi = 0;
        for(int i=0;i<n;i++)
        {
            int sum = 0;
            for(int j=i;(j<k+i)&&(j<n);j++)
            {
                sum+=arr[j];
            }
          maxi = Math.max(sum,maxi);
        }
        return maxi;
    }
}
