class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int c = strs[0].length();
        String s = "";
        String chr = "";
        for(int i=0;i<c;i++)
        {
            chr+=String.valueOf(strs[0].charAt(i));
            int count = 0;
            for(int j=1;j<n;j++)
            {
                if(strs[j].startsWith(chr))
                {
                     count++;
                }
               
            }
            if(count==n-1)
            {
                s+=String.valueOf(strs[0].charAt(i));
            }
            else{
                return s;
            }
        }
        return s;
    }
}
