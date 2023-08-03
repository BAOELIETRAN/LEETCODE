class Solution {
public:
    bool PredictTheWinner(vector<int>& nums) {
        int n = nums.size();
        int dp[n + 1][n + 1];       //khoang cach giua hai player p1 va p2 neu ma ho choi toi uu trong khoang tu i den j
        memset(dp, 0, sizeof(dp));
        for (int j = 0; j < n; j++) {
            dp[j][j] = nums[j];
            for (int i = j - 1; i >= 0; i--) {
                dp[i][j] = max(nums[j] - dp[i][j - 1], nums[i] - dp[i + 1][j]);
            }
        }
        return dp[0][n - 1] >= 0;
    }
};