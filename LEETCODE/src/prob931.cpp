class Solution {
public:
    int minFallingPathSum(vector<vector<int>>& matrix) {
        int row = matrix.size();
        int col = matrix[0].size();
        int dp[row + 1][col + 1];
        memset(dp, 0x3f, sizeof(dp));
        for (int i = 0; i < col; i++) {
            dp[0][i] = matrix[0][i];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < col; j++) {
                dp[i][j] = min(dp[i][j], dp[i - 1][j] + matrix[i][j]);
                if (j != 0) {
                    dp[i][j] = min(dp[i][j], dp[i - 1][j - 1] + matrix[i][j]);
                }
                if (j != col - 1) {
                    dp[i][j] = min(dp[i][j], dp[i - 1][j + 1] + matrix[i][j]);
                }
            }
        }
        int res = 1e9;
        for (int i = 0; i < col; i++) {
            res = min(res, dp[row - 1][i]);
        }
        return res;
    }
};