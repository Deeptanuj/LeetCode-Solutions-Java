class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if(n1 > n2) return findMedianSortedArrays(nums2, nums1);
        int low = 0;
        int high = n1;
        int left = (n1 + n2 + 1) / 2;
        while(low <= high){
            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;
            int m1 = low + (high - low) / 2;
            int m2 = left - m1;
            if(m1 - 1 >= 0) l1 = nums1[m1 - 1];
            if(m2 - 1 >= 0) l2 = nums2[m2 - 1];
            if(m1 < n1) r1 = nums1[m1];
            if(m2 < n2) r2 = nums2[m2];
            if(l1 <= r2 && l2 <= r1){
                if((n1 + n2) % 2 != 0) return Math.max(l1, l2);
                else return ((double)(Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            }
            else if(l2 > r1) low = m1 + 1;
            else high = m1 - 1;
        }
        return 0;
    }
}