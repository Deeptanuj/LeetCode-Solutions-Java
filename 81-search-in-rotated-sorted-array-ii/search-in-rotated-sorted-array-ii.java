class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(l <= r){
            int m = l + (r - l) / 2;

            if(nums[m] == target) return true;

            //IF nums[l] == nums[m] == nums[r] then reduce the window size
            if(nums[l] == nums[m] && nums[m] == nums[r]){
                l++;
                r--;
                continue;
            }

            //If left side is sorted
            if(nums[l] <= nums[m]){
                if(nums[l] <= target && target < nums[m]) r = m - 1;
                else l = m + 1;
            }

            //If Right side is sorted
            else{
                if(nums[m] < target && target <= nums[r]) l = m + 1;
                else r = m - 1;
            }
        }
        return false;
    }
}