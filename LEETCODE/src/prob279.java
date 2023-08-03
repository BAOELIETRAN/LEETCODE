import java.util.Arrays;

class prob279 {
    public int numSquares(int n) {
        int[]dp = new int[n + 1];
        Arrays.fill(dp, n + 1);
        dp[0] = 0;
        dp[1] = 1;
        for (int sum = 2; sum <= n; sum ++){
            for (int num = 1; num <= Math.sqrt(sum); num ++){
                dp[sum] = Math.min(dp[sum - num*num] + 1, dp[sum]);
            }
        }
        return dp[n];
    }
}