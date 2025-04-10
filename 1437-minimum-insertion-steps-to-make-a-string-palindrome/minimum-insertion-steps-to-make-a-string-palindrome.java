class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        String rev = reverse(s);
        int m = rev.length();
        int dp[][] = new int[n + 1][m + 1];
        for(int i  = 0; i < m + 1; i++){
            dp[0][i] = 0;
        }
        for(int i = 0; i < n + 1; i++){
            dp[i][0] = 0;
        }

        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < m + 1; j++){
                if(s.charAt(i - 1) == rev.charAt(j - 1)) dp[i][j] = 1 + dp[i - 1][j - 1];
                else dp[i][j] = max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        int lps = dp[n][m];
        return s.length() - lps;
    }
    private static String reverse(String s){
        String ans = " ";
        for(int i = s.length() - 1; i >= 0; i--){
            ans += s.charAt(i);
        }
        return ans;
    }
    private static int max(int a, int b){
        return (a > b) ? a : b;
    }
}