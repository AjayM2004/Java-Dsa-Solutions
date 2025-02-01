class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int sum = 0;
        for(int i=1;i<n;i++)
        {
            if(prices[i]>prices[i-1])
            {
                int profit=prices[i]-prices[i-1];
                sum+=profit;
            }
        }
        return sum;
    }
}
