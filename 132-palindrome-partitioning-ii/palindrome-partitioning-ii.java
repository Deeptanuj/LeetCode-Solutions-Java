class Solution {
    public int minCut(String s) {
        int n = s.length();
        int dp[][] = new int[n + 1][n + 1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        boolean[][] isPalindrome = new boolean[n][n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i <= j; i++) {
                isPalindrome[i][j] = (s.charAt(i) == s.charAt(j)) && (j - i < 2 || isPalindrome[i + 1][j - 1]);
            }
        }
        return helper(s, 0, n - 1, isPalindrome, dp);
    }
    private int helper(String s, int i, int j, boolean isPal[][], int dp[][]){
        if(i >= j) return 0;

        if(isPal[i][j]) return 0;

        if(dp[i][j] != -1) return dp[i][j];

        int mini = Integer.MAX_VALUE;
        for(int k = i; k < j; k++){
            if(isPal[i][k]){
                mini = Math.min(mini, 1 + helper(s, k + 1, j, isPal, dp));
            }
        }
        dp[i][j] = mini;
        return mini;
    }
}