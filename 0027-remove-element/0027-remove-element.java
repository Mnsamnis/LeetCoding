class Solution {
    public int removeElement(int[] nums, int val) {
        
        int k = 0; // Tracks the position where the next non-equal element should be placed
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val, place it at position k and increment k
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        
        return k;
    
        
    }
}