class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int maxlen = 0;
        int zeros = 0;
        while(r < nums.length){
            if(nums[r] == 0) zeros++;
            while(zeros > k && l <= r){
                if(nums[l] == 0) zeros--;
                l++;
            }
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }
        return maxlen;
    }
}