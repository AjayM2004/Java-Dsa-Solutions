import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, maxi = 0;

        for (int r = 0; r < s.length(); r++) {
            if (map.containsKey(s.charAt(r))) {
                l = Math.max(map.get(s.charAt(r)) + 1, l);  // Move left pointer efficiently
            }
            map.put(s.charAt(r), r);  // Update the latest index of the character
            maxi = Math.max(maxi, r - l + 1);
        }
        return maxi;
    }
}
