class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int min = Integer.MAX_VALUE;
        while(l <= r){
            int m = l + (r - l) / 2;
            
            //IF LEFT SIDE IS SORTED
            if(nums[l] <= nums[m]){
                min = Math.min(min, nums[l]);
                l = m + 1;
            }

            //IF RIGHT SIDE IS SORTED
            else{
                min = Math.min(min, nums[m]);
                r = m - 1;
            }
        }
        return min;
    }
}