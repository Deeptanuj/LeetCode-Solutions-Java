class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = nums.length;
        return helper(nums, ans, 0, nums.length - 1, target);
    }
    private int helper(int nums[], int ans, int l, int r, int target){
        if(l > r) return ans;
        
        int m = l + (r - l) / 2;
        
        if(nums[m] >= target){
            ans = m;
            return helper(nums, ans, l, m - 1, target);
        }
        return helper(nums, ans, m + 1, r, target);
    }
}