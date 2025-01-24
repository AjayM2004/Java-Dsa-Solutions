class Solution {
    public String reverseWords(String s) {
       String s1 = s.trim();
       String[] str1 = s1.split("\\s+");
       StringBuilder ans = new StringBuilder();
       for(int i=str1.length-1;i>=0;i--)
       {
           ans.append(str1[i]);
           if(i>0)
           {
              ans.append(" ");
           }
       }
       return ans.toString();
    }
}
