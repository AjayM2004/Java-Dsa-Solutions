class Solution {
    public int singleNonDuplicate(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int n = nums.length;
        // for(int i=0;i<n;i++)
        // {
        //     int freq = 0;
        //     if(map.containsKey(nums[i]))
        //     {
        //         freq = map.get(nums[i]);
        //     }
        //      freq++;
        //      map.put(nums[i],freq);
        // }
        // for(int key:map.keySet())
        // {
        //     if(map.get(key)==1)
        //     {
        //         return key;
        //     }
        // }
        // return -1;
        //optimal solution
        int xor = 0;
        for(int num:nums)
        {
            xor = xor ^ num;
        }
        return xor;
    }
}
