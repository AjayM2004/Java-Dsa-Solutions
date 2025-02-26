class Solution {

    public int smallestDivisor(int[] nums, int threshold) {
          int maxi = nums[0];
          int smallest=-1;
          for(int i=1;i<nums.length;i++)
          {
              if(maxi<nums[i])
              {
                maxi = nums[i];
              }
          }
          int low = 1,high = maxi,ans=-1;
          while(low<=high)
          {
              int mid = (low+high)/2;
              int sum = 0;
              for(int j=0;j<nums.length;j++)
              {
                  sum+=(int)Math.ceil((double)nums[j]/mid); 
              }
              if(sum<=threshold)
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
