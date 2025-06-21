import java.util.*;  

class Solution {  
    public int removeElement(int[] nums, int val) {  
        int k = 0; // Pointer for the position to place the next non-val element  
        for (int i = 0; i < nums.length; i++) {  
            if (nums[i] != val) {  
                nums[k] = nums[i]; // Place non-val element at index k  
                k++; // Increment the position index  
            }  
        }  
        return k; // Return the new length of the array  
    }   
}
