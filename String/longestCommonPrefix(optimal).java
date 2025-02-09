class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n==0)
        {
            return "";
        }
        int m = strs[0].length();
        StringBuilder ans = new StringBuilder();
        char currentChr;
        for(int i=0;i<m;i++)
        {
            currentChr = strs[0].charAt(i);
            for(int j=1;j<n;j++)
            {
                if(i>=strs[j].length() || currentChr != strs[j].charAt(i))
                {
                    return String.valueOf(ans);
                }
            }
            ans.append(String.valueOf(currentChr));
        }
        return String.valueOf(ans);
    }
}
