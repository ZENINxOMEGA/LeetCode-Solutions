class Solution {  
    public boolean isPalindrome(int x) {  
        // Negative numbers and numbers that end with 0 (except 0 itself) are not palindromes  
        if (x < 0 || (x % 10 == 0 && x != 0)) {  
            return false;  
        }  
        int reversedNumber = 0;  
        while (x > reversedNumber) {  
            reversedNumber = reversedNumber * 10 + x % 10;  
            x /= 10;  
        }  
        // For odd length numbers, we can get rid of the middle digit by reversedNumber / 10  
        return x == reversedNumber || x == reversedNumber / 10;  
    }  
}
