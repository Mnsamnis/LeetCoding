import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> result= new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
             if (result.containsKey(diff)) {
                return new int[]{result.get(diff), i};
            }
            result.put(nums[i], i);
        }
        return new int[0];
    }
}