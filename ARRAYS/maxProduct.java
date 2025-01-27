class Solution {
    public int maxProduct(int[] nums) {
       int maxi = Integer.MIN_VALUE;
       int preSum = 1;
       int sufSum = 1;
       int n = nums.length;
       for(int i=0;i<n;i++)
       {
           if(preSum==0)
           {
             preSum = 1;
           }
           if(sufSum==0){
            sufSum =  1;
           }
           preSum = preSum * nums[i];
           sufSum = sufSum * nums[n-i-1];
           maxi = Math.max(maxi,Math.max(preSum,sufSum));
       }
       return maxi;
    }
}
