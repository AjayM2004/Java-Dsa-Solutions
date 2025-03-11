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
        for(int i=1;i<=max;i++)
        {
            int ans = findHour(piles,i);
            if(ans<=h)
            {
                return i;
            }
        }
        return -1;
    }
}
//tc -> O(n*max(piles))
//sc -> O(1)
