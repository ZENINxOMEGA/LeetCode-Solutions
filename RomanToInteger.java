import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        // Create a hashmap to store the values of the Roman numerals
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Iterate through each character in the string from last to first
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.get(currentChar);

            // If the current value is less than the previous value, subtract it
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                // Otherwise, add it to the result
                result += currentValue;
            }
            // Update previous value
            prevValue = currentValue;
        }

        return result;
    }
}
