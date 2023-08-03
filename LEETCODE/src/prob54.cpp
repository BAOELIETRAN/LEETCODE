class Solution {
public:
    bool visit[11][11];
    int dx[4] = { 0,1,0,-1 };
    int dy[4] = { 1,0,-1,0 };
    vector<int> res;
    void dfs(vector<vector<int>>& matrix, int row, int col, int dir) {
        res.push_back(matrix[row][col]);
        visit[row][col] = true;
        for (int i = 0; i < 4; i++) {
            int new_row = row + dx[dir];
            int new_col = col + dy[dir];
            if (new_row >= 0 && new_row < matrix.size() && new_col >= 0 && new_col < matrix[0].size()) {
                if (visit[new_row][new_col] == false) {
                    dfs(matrix, new_row, new_col, dir);
                }
            }
            dir = (dir + 1) % 4;
        }
    }
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        dfs(matrix, 0, 0, 0);
        return res;
    }
};