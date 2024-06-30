class Solution {
    public int[] searchRange(int[] nums, int target) {
        
    final int l = findFirst(nums, target);
    if (l == nums.length || nums[l] != target)
      return new int[] {-1, -1};
    final int r = findFirst(nums, target + 1) - 1;
    return new int[] {l, r};
  }

  private int findFirst(int[] A, int target) {
    int l = 0;
    int r = A.length;
    while (l < r) {
      final int m = (l + r) / 2;
      if (A[m] >= target)
        r = m;
      else
        l = m + 1;
    }
    return l;
        
    }
}