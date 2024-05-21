class Solution {
    public int majorityElement(int[] nums) {
        int arrow = 0;
        int count = 0;
        
        // Step 1: Find the arrow
        for (int num : nums) {
            if (count == 0) {
                arrow = num;
                count = 1;
            } else if (num == arrow) {
                count++;
            } else {
                count--;
            }
        }
        
        // Step 2: The arrow is guaranteed to be the majority element
        return arrow;
    }
}