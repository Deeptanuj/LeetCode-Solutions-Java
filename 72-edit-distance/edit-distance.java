class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n + 1][m + 1];
        for(int i = 0; i < m + 1; i++){
            dp[0][i] = i;
            //IF WORD1 IS EMPTY THE INSERT ALL ELEMENT OF WORD2
        }
        for(int i = 0; i < n + 1; i++){
            dp[i][0] = i;
            //IF WORD2 IS EMPTY THEN DELETE ALL ELEMENT OF WORD1
        }
        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < m + 1; j++){
                if(word1.charAt(i - 1) == word2.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1];
                //WE ARE NOT COUNTING NUMBER OF COMMON ELEMENTS THIS TIME LIKE LCS
                //WE HAVE TO COUNT THE MIN NUMBER OF INSERT/DELETE/REPLACE OPERATION
                else{
                    int insert = 1 + dp[i][j - 1];
                    int delete = 1 + dp[i - 1][j];
                    int replace = 1 + dp[i - 1][j - 1];
                    dp[i][j] = min(insert, min(delete, replace));
                }
            }
        }

        return dp[n][m];
    }
    private static int min(int a, int b){
        return (a < b) ? a : b;
    }
}