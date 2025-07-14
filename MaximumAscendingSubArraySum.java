class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = 0; // Stores the maximum sum found
        int currentSum = nums[0]; // Stores the sum of the current ascending subarray
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentSum += nums[i]; // Extend the current subarray
            } else {
                maxSum = Math.max(maxSum, currentSum); // Update max sum if needed
                currentSum = nums[i]; // Start a new subarray
            }
        }
        
        return Math.max(maxSum, currentSum); // Final comparison for the last subarray
    }
}
