class Solution {
    public boolean canPartition(int[] nums) {
      //USING BOTTOM UP APPROACH
      int n = nums.length;
      int sum = 0;
      for(int i : nums){
        sum += i;
      }  
      if(sum % 2 == 1) return false;

      sum = sum / 2;

      //IF ARRAY IS EMPTY STROE FALSE
      boolean dp[][] = new boolean[n + 1][sum + 1];
      for(int i = 0; i < sum + 1; i++){
        dp[0][i] = false;
      }

      //IF SUM = 0 STORE TRUE
      for(int j = 0; j < n + 1; j++){
        dp[j][0] = true;
      }

      for(int i = 1; i < n + 1; i++){
        for(int j = 1; j < sum + 1; j++){
            if(nums[i - 1] <= j) dp[i][j] = dp[i - 1][j - nums[i - 1]] || dp[i - 1][j];
            else dp[i][j] = dp[i - 1][j];
        }
      }

      return dp[n][sum];
    }
}