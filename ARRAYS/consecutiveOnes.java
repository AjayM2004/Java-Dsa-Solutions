class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int N) {
        String ans = Integer.toBinaryString(N);
        int count = 0;
        int maxi = 0;
        for(int i=0;i<ans.length();i++)
        {
            if(ans.charAt(i)=='1')
            {
                count++;
                maxi = Math.max(count,maxi);
            }
            else{
                count=0;
            }
        }
        return maxi;
    }
}
