class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0]=ans[1]=-1;
        int left=0,right=nums.length-1;
        while(left<right)
        {
            int sum = nums[left]+nums[right];
            if(sum==target)
            {
                ans[0]=left+1;
                ans[1]=right+1;
                return ans;
            }
            else if(sum<target)
            {
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
}
