class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n + 1][m + 1];
        for(int i = 0; i < m + 1; i++){
            dp[0][i] = 0;
        }
        for(int i = 0; i < n + 1; i++){
            dp[i][0] = 0;
        }
        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < m + 1; j++){
                if(word1.charAt(i - 1) == word2.charAt(j - 1)) dp[i][j] = 1 + dp[i - 1][j - 1];
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        int LCS = dp[n][m];
        return (n - LCS) + (m - LCS); 
        //DOING THIS WE GET THE EXTRA UNCOMMON CHARACTERS IN BOTH STRINGS AND ADDING THAT WE GET
        //TOTAL NUMBER OF DELETION NEEDED.
    }
}