class Solution {
    static void bitManipulation(int num, int i) {
        // Extract the i-th bit (1-based index)
        int ans1 = (num & (1 << (i - 1))) != 0 ? 1 : 0;

        // Set the i-th bit
        int ans2 = num | (1 << (i - 1));

        // Clear the i-th bit
        int ans3 = num & ~(1 << (i - 1));

        // Print output in required format
        System.out.print(ans1 + " " + ans2 + " " + ans3);
    }
}
