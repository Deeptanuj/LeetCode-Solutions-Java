class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int[n + 1][m + 1];
        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < m + 1; j++){
                dp[i][j] = -1;
            }
        }
        return lcs(text1, text2, n, m, dp);
    }
    private int lcs(String x, String y, int n, int m, int dp[][]){
        if(n == 0 || m == 0) return 0;

        if(dp[n][m] != -1) return dp[n][m];

        if(x.charAt(n-1) == y.charAt(m - 1)) return dp[n][m] = 1 + lcs(x, y, n-1, m-1, dp);

        return dp[n][m] = Math.max(lcs(x, y, n, m-1, dp), lcs(x, y, n-1, m, dp));
    }
}