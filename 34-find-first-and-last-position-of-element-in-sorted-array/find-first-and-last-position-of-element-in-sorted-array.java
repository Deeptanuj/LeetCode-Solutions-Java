class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = firstPosi(nums, target);
        ans[1] = lastPosi(nums, target);
        return ans;
    }
    private int firstPosi(int arr[], int n){
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while(l <= r){
            int m = l + (r -l) / 2;

            if(arr[m] == n){
                ans = m;
                r = m - 1;
            } else if(arr[m] < n) l = m + 1;
            else r = m - 1;
        }
        return ans;
    }
    private int lastPosi(int arr[], int n){
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while(l <= r){
            int m = l + (r - l) / 2;

            if(arr[m] == n){
                ans = m;
                l = m + 1;
            } else if(arr[m] < n) l = m + 1;
            else r = m - 1;
        }
        return ans;
    }
}