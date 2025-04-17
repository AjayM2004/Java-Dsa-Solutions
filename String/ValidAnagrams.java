class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
       int n = s1.length();
       int m = s2.length();
       if(m!=n)
       {
           return false;
       }
       int[] freq = new int[26];
       for(int i=0;i<n;i++)
       {
           freq[s1.charAt(i)-'a']++;
           freq[s2.charAt(i)-'a']--;
       }
       for(int i=0;i<26;i++)
       {
           if(freq[i]!=0)
           {
               return false;
           }
       }
       return true;
    }
}
