class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = leftbound(nums, target);
        ans[1] = rightbound(nums, target);
        return ans;
    }
    private int leftbound(int arr[], int x){
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while(l <= r){
            int m = l + (r - l) / 2;

            if(arr[m] == x){
                ans = m;
                r = m - 1;
            }
            else if(arr[m] < x) l = m + 1;
            else r = m - 1;
        }

        return ans;
    }
    private int rightbound(int arr[], int x){
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while(l <= r){
            int m = l + (r - l) / 2;

            if(arr[m] == x){
                ans = m;
                l = m + 1;
            }
            else if(arr[m] < x) l = m + 1;
            else r = m - 1;
        }
        return ans;
    }
}