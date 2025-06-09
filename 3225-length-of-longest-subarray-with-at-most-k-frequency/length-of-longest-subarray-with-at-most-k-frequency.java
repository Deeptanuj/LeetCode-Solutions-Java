class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int maxlen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(r < nums.length){
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            while(map.get(nums[r]) > k && l <= r){
                map.put(nums[l], map.get(nums[l]) - 1);
                if(map.get(nums[l]) == 0) map.remove(nums[l]);
                l++;
            }
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }
        return maxlen;
    }
}