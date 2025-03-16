class Solution {
    public int binaryToDecimal(String b) {
        int len = b.length();
        int p2 = 1;
        int num = 0;
        for(int i=len-1;i>=0;i--)
        {
            if(b.charAt(i)=='1')
            {
                num = num + p2;  
            }
            p2 = p2 * 2;
        }
        return num;
    }
}
