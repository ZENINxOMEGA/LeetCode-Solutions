class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int i = 1; // Pointer for placing the next unique element
        
        for (int j = 1; j < nums.length; j++) {
            // If the current element is different from the previous element
            if (nums[j] != nums[j - 1]) {
                nums[i] = nums[j]; // Place it at the correct position
                i++; // Increment the pointer for unique elements
            }
        }
        
        return i; // The number of unique elements
    }
}
