class Solution {
    static int lowerBound(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = nums.length - 1;
        int ans = n;
        while (low <= high) {

            int mid = (low + high) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int upperBound(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = nums.length - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int lb = lowerBound(nums, target);
        int n = nums.length;
        if (lb == n || nums[lb] != target) {
            return new int[] { -1, -1 };
        }
        return new int[] { lb, upperBound(nums, target) - 1 };
    }
}
