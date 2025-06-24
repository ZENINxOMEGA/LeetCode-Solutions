class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {  
            if (digits[i] < 9) {  
                digits[i]++;  
                return digits;  
            }  
            digits[i] = 0;  // Set the current digit to 0 and move to the next left digit
        }  
        
        // If we reach this point, all digits were 9 (e.g., 999 → 1000)
        int[] newDigits = new int[n + 1];  
        newDigits[0] = 1;  
        return newDigits;  
    }
}
