class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Character> boys = new HashMap<>();
        HashMap<Character,Character> girls = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
        char b = s.charAt(i);
        char g = t.charAt(i);
        if(boys.containsKey(b) && boys.get(b)!=g)
        {
             return false;
        }
        if(girls.containsKey(g) && girls.get(g)!=b)
        {
            return false;
        }
        boys.put(b,g);
        girls.put(g,b);
        }
      return true;
    }

}
