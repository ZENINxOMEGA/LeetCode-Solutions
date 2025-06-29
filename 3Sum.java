import java.util.ArrayList;  
import java.util.Arrays;  
import java.util.List;  

class Solution {  
    public List<List<Integer>> threeSum(int[] nums) {  
        List<List<Integer>> result = new ArrayList<>();  
        Arrays.sort(nums); // Sort the array to make it easier to find duplicates  
        
        for (int i = 0; i < nums.length - 2; i++) {  
            // Skip duplicate elements for the first number  
            if (i > 0 && nums[i] == nums[i - 1]) continue;  

            int left = i + 1;  
            int right = nums.length - 1;  

            while (left < right) {  
                int sum = nums[i] + nums[left] + nums[right];  
                
                if (sum == 0) {  
                    // Found a triplet  
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));  
                    
                    // Skip duplicates for the second number  
                    while (left < right && nums[left] == nums[left + 1]) left++;  
                    // Skip duplicates for the third number  
                    while (left < right && nums[right] == nums[right - 1]) right--;  
                    
                    // Move both pointers  
                    left++;  
                    right--;  
                } else if (sum < 0) {  
                    left++; // We need a larger sum  
                } else {  
                    right--; // We need a smaller sum  
                }  
            }  
        }  
        
        return result;  
    }  
}
