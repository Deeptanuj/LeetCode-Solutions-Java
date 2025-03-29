class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        if(target > sum) return 0;
        if((target + sum) % 2 != 0) return 0;
        if((target + sum) < 0) return 0;

        int s1 = (target + sum) / 2;

        int dp[][] = new int[n + 1][s1 + 1];
        for(int i = 0; i < s1 + 1; i++){
            dp[0][i] = 0;
        }
        for(int i = 0; i < n + 1; i++){
            dp[i][0] = 1;
        }

        for(int i = 1; i < n + 1; i++){
            for(int j = 0; j < s1 + 1; j++){
                if(nums[i - 1] <= j) dp[i][j] = dp[i - 1][j - nums[i - 1]] + dp[i - 1][j];
                else dp[i][j] = dp[i - 1][j];
            }
        }

        return dp[n][s1];
    }
}