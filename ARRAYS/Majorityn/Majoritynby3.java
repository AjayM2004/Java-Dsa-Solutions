import java.util.*;
class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int e1 = Integer.MIN_VALUE;
        int e2 = Integer.MIN_VALUE;
        int n = nums.length;
        int min = (n/3)+1;
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++)
        {
            if(count1==0 && e2!=nums[i])
            {
                count1=1;
                e1 = nums[i];
            }
            else if(count2==0 && e1!=nums[i])
            {
                count2=1;
                e2 = nums[i];
            }
            else if(e1==nums[i])
            {
                count1++;
            }
            else if(e2==nums[i])
            {
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==e1)
            {
                count1++;
            }
            if(nums[i]==e2)
            {
                count2++;
            }
        }
        if(count1>=min)
        {
            list.add(e1);
        }
        if(count2>=min)
        {
            list.add(e2);
        }
        Collections.sort(list);
        return list;
    }
}
