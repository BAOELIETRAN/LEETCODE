class prob1143 {
    public:
        int longestCommonSubsequence(string text1, string text2) {
            int dp[1001][1001]; //do dai common substring dai nhat trong i chu cai dau cua text 1 va j chu cai dau text 2
            memset(dp, 0,sizeof(dp));
            int n = text1.length();
            int m = text2.length();
            text1 = " " + text1;
            text2 = " " + text2;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (text2[j] == text1[i]) {
                        dp[i][j] = max(1 + dp[i - 1][j - 1], dp[i][j]);
                    }
                    else {
                        dp[i][j] = max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
            return dp[n][m];
        }
    };