class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            int freq = 0;
            char current = s.charAt(i);
            if(map.containsKey(current))
            {
                freq = map.get(current);
            }
            freq++;
            map.put(current,freq);
        }
        ArrayList<Character> characters = new ArrayList<>(map.keySet());
        characters.sort((a,b)->map.get(b)-map.get(a));
        StringBuilder ans = new StringBuilder();
        for(char c : characters)
        {
            int count = map.get(c);
            ans.append(String.valueOf(c).repeat(count));
        }
        return ans.toString();
    }
}
