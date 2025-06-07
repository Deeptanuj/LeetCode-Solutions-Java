class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = firstOcc(nums, target);
        ans[1] = lastOcc(nums, target);
        return ans;
    }
    private static int firstOcc(int arr[], int target){
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while(l <= r){
            int m = l + (r - l) / 2;
            if(arr[m] == target){
                ans = m;
                r = m - 1;
            } else if(arr[m] < target) l = m + 1;
            else r = m - 1;
        }
        return ans;
    }
    private static int lastOcc(int arr[], int target){
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while(l <= r){
            int m = l + (r - l) / 2;
            if(arr[m] == target){
                ans = m;
                l = m + 1;
            } else if(arr[m] < target) l = m + 1;
            else r = m - 1;
        }
        return ans;
    }
}