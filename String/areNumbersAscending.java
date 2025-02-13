import java.util.*;

class Solution {
    public boolean areNumbersAscending(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int n = s.length();
        
        while (i < n) {
            if (Character.isDigit(s.charAt(i))) {
                int value = 0;
                
                // Extract the full number
                while (i < n && Character.isDigit(s.charAt(i))) {
                    value = value * 10 + (s.charAt(i) - '0');
                    i++;
                }

                // Check if numbers are strictly increasing
                if (!list.isEmpty() && list.get(list.size() - 1) >= value) {
                    return false;
                }
                
                list.add(value);
            } else {
                i++; // Move to the next character if it's not a digit
            }
        }
        return true;
    }

    
}
