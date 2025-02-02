class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int peak = -1;
        for(int i=0;i<n;i++)
        {
            if((i==0 || nums[i]>nums[i-1])&&(i==n-1 || nums[i]>nums[i+1]))
            {
                peak = i;
            }
        }
        return peak;
    }
}
