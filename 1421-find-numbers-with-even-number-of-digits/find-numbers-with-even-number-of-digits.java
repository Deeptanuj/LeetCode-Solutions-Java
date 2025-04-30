class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums){
            if(hasEven(i)) count++;
        }
        return count;
    }
    private static boolean hasEven(int n){
        int digits = (int)(Math.log10(n)) + 1;
        if(digits % 2 != 0) return false;
        return true;
    }
}