class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k - 1);
    }
    private static int helper(int arr[], int k){
        int l = 0;
        int r = 0;
        int count = 0;
        int odds = 0;
        while(r < arr.length){
            if(arr[r] % 2 != 0) odds++;
            while(odds > k && l <= r){
                if(arr[l] % 2 != 0) odds--;
                l++;
            }
            count += r - l + 1;
            r++;
        }
        return count;
    }
}