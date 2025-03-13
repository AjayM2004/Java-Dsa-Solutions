

/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    int floorSqrt(int n) {
        int low = 1;
        int high = n;
        int ans = 0;
        int mid;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(mid*mid<=n)
            {
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
}
