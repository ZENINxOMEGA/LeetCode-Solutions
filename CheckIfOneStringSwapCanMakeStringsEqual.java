class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        // If the strings are already equal, return true
        if (s1.equals(s2)) {
            return true;
        }

        int n = s1.length();
        int first = -1, second = -1; // To store indices of mismatched characters
        int count = 0; // Count mismatches

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count > 2) {
                    return false; // More than two mismatches means swap can't fix
                }
                if (first == -1) {
                    first = i;
                } else {
                    second = i;
                }
            }
        }

        // There must be exactly two mismatches, and swapping should fix them
        return count == 2 && 
               s1.charAt(first) == s2.charAt(second) &&
               s1.charAt(second) == s2.charAt(first);
    }
}
