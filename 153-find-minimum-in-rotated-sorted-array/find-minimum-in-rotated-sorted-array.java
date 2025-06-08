class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int mini = Integer.MAX_VALUE;
        while(l <= r){
            int m = l + (r - l) / 2;
            if(nums[l] <= nums[m]){
                mini = Math.min(mini, nums[l]);
                l = m + 1;
            }
            else{
                mini = Math.min(mini, nums[m]);
                r = m - 1;
            }
        }
        return mini;
    }
}