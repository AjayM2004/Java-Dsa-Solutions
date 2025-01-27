class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;

        //nums[i]>nums[(i+1)%n]
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>nums[(i+1)%n])
            {
                count++;
            }
        }
        boolean ans = count<=1;
        return ans;
    }
}
