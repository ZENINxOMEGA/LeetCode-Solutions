import java.util.HashMap;

class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> productCount = new HashMap<>();
        int result = 0;
        int n = nums.length;

        // Step 1: Compute products and count occurrences
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }

        // Step 2: Calculate valid tuples
        for (int count : productCount.values()) {
            if (count > 1) {
                result += count * (count - 1) / 2 * 8;
            }
        }

        return result;
    }
}
