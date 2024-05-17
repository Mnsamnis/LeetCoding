class Solution {
    public int removeDuplicates(int[] nums) {
                if (nums.length == 0) return 0; // If array is empty, no duplicates
        
        int k = 1; // Tracks the position where the next unique element should be placed
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous one, place it at position k
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }
        
        return k; // k represents the number of unique elements
        
    }
}