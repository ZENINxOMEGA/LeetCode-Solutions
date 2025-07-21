import java.util.HashMap;

class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Long> map = new HashMap<>();
        long n = nums.length;
        long totalPairs = (n * (n - 1)) / 2;  // Total pairs in the array
        long goodPairs = 0;  // Count of good pairs

        for (int i = 0; i < n; i++) {
            int key = nums[i] - i; // nums[j] - j should be equal for good pairs
            if (map.containsKey(key)) {
                goodPairs += map.get(key);
            }
            map.put(key, map.getOrDefault(key, 0L) + 1);
        }

        return totalPairs - goodPairs;  // Bad pairs = Total pairs - Good pairs
    }
}
