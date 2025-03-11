class Solution {
    static int findHour(int[] arr,int no_ban_perhour)
    {
        int n = arr.length;
        int req = 0;
        for(int i=0;i<n;i++)
        {
            req+=Math.ceil((double)arr[i]/no_ban_perhour);
        }
        return req;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int i=1;i<piles.length;i++)
        {
            if(max<piles[i])
            {
                max = piles[i];
            }
        }
        int ans = max;
        int low = 1;
        int high = max;
       while(low<=high)
       {
            int mid = (low+high)/2;

            int req = findHour(piles,mid);
            if(req<=h)
            {
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
      return ans;  
    }
}
//tc -> O(n*max(piles))
//sc -> O(1)
