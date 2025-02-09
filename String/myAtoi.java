class Solution {
    public int myAtoi(String s) {
       long result = 0;
       int n = s.length();
       int sign = 1;
       int i=0;
       int sCount=0;
       while(i<n && s.charAt(i)==' ')
       {
           i++;
       }
       while(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+'))
       {
          sign = (s.charAt(i)=='-')?-1:1;
          i++;
          sCount++;
          if(sCount>=2)
          {
            return 0;
          }
       }
       while(i<n && Character.isDigit(s.charAt(i)))
       {
            result = result*10 + s.charAt(i)-'0';
            if(result>Integer.MAX_VALUE)
            {
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            i++;
       }
       return sign*(int)result;
    }
}
