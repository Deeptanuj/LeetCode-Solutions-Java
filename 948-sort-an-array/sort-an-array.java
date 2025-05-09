class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums, 0, nums.length - 1);
        return nums;
    }
    private static void divide(int nums[], int l, int r){
        if(l >= r) return;

        int m = l + (r - l) / 2;
        divide(nums, l, m);
        divide(nums, m + 1, r);
        conquer(nums, l, m, r);
    }
    private static void conquer(int nums[], int s, int m, int e){
        int merge[] = new int[e - s + 1];
        int l = s;
        int r = m + 1;
        int idx = 0;
        while(l <= m && r <= e){
            if(nums[l] <= nums[r]) merge[idx++] = nums[l++];
            else merge[idx++] = nums[r++];
        }
        while(l <= m){
            merge[idx++] = nums[l++];
        }
        while(r <= e){
            merge[idx++] = nums[r++];
        }

        int j = s;
        for(int i = 0; i < merge.length; i++){
            nums[j++] = merge[i];
        }
    }
}