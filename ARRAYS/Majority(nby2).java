class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        
        int element=0;
        for(int i=0;i<n;i++)
        {
             if(count==0)
             {
                element=nums[i];
                count=1;
             }
             else if(nums[i]==element)
             {
                count++;
             }
             else
             {
                count--;
             }
        }
        count=0;
        for(int e:nums)
        {
            if(e==element)
            {
                count++;
            }
        }
        if(count>n/2)
        {
            return element;
        }
    return 0;
}
}
