class Solution {
    public int missingNumber(int[] nums) {
        int allXOR = 0;
        for(int i = 0; i <= nums.length; i++){
            allXOR ^= i;
        }
        for(int i : nums){
            allXOR ^= i;
        }
        return allXOR;
    }
}