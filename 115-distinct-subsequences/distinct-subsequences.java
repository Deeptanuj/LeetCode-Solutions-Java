class Solution {
    public int numDistinct(String s, String t) {
        //IT IS LIKE COUNT NO OF SUBSET OF TARGET SUM PROBLEM (MEANS CONCEPT OF 0 1 KNAPSACK)
        int n = s.length();
        int m = t.length();
        int dp[][] = new int[n + 1][m + 1];
        for(int i = 0; i < m + 1; i++){
            dp[0][i] = 0;
        }
        for(int i = 0; i < n + 1; i++){
            dp[i][0] = 1;
        }
        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < m + 1; j++){
                if(s.charAt(i - 1) == t.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                else dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n][m];
    }
}