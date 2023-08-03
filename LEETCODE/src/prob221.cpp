class prob221 {
public:
    int maximalSquare(vector<vector<char>>& matrix) {
        int row = matrix.size();
        int col = matrix[0].size();
        int dp[row + 1][col + 1];       //do dai canh dai nhat cua hinh vuong tai vi tri i j
        memset(dp, 0, sizeof(dp));
        int result = 0;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = min({ dp[i - 1][j], dp[i][j - 1], dp[i - 1][j - 1] }) + 1;
                    result = max(dp[i][j], result);
                }
            }
        }
        return result * result;
    }
};