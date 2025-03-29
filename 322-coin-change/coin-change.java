class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n + 1][amount + 1];
        for(int i = 0; i < amount + 1; i++){
            dp[0][i] = Integer.MAX_VALUE - 1;
        }
        for(int i = 0; i < n + 1; i++){
            dp[i][0] = 0;
        }

        for(int i = 1; i < n + 1; i++){
            for(int j = 0; j < amount + 1; j++){
                if(coins[i - 1] <= j){
                    dp[i][j] = min(1 + dp[i][j - coins[i - 1]], dp[i - 1][j]);
                }
                else dp[i][j] = dp[i - 1][j];
            }
        }

        return dp[n][amount] >= Integer.MAX_VALUE - 1 ? -1 : dp[n][amount];
    }
    private static int min(int a, int b){
        return (a < b) ? a : b;
    }
}