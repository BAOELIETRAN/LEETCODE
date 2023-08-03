class prob329 {
public:
    int dp[201][201]; //do dai dai nhat bat dau tu i j
    int dx[4] = { -1,1,0,0 };
    int dy[4] = { 0,0,-1,1 };
    int dfs(vector<vector<int>>& matrix, int row, int col) {
        int result = 1;
        if (dp[row][col] != 0) {
            return dp[row][col];
        }
        for (int i = 0; i < 4; i++) {
            int new_row = row + dx[i];
            int new_col = col + dy[i];
            if (new_row >= 0 && new_row < matrix.size() && new_col >= 0 && new_col < matrix[0].size()) {
                if (matrix[new_row][new_col] > matrix[row][col]) {
                    result = max(dfs(matrix, new_row, new_col) + 1, result);
                }
            }
        }
        dp[row][col] = result;
        return result;
    }
    int longestIncreasingPath(vector<vector<int>>& matrix) {
        int result = 0;
        int row = matrix.size();
        int col = matrix[0].size();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result = max(dfs(matrix, i, j), result);
            }
        }
        return result;
    }
};