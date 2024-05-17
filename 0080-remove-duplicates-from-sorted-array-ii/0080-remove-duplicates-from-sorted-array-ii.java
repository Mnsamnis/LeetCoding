class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k = 0; // Tracks the position where the next non-duplicate element should be placed
        
        // Iterate through the array
        for (int num : nums) {
            // Keep the current element if it's different from the previous two elements
            if (k < 2 || num != nums[k - 2]) {
                nums[k++] = num;
            }
        }
        
        return k; // k represents the number of elements after removing duplicates
    }
}                
