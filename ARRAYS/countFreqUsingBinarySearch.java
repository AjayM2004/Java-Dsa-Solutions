class Solution {
    static int upperBound(int[] arr,int target)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]>target)
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
    static int lowerBound(int[] arr,int target)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]>=target)
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
    int countFreq(int[] arr, int target) {
         int n = arr.length;
         int lb = lowerBound(arr,target);
         if(lb==n || arr[lb]!=target)
         {
             return 0;
         }
         else{
             return upperBound(arr,target)-lb;
         }
       
    }
}
