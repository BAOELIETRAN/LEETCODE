class prob322 {
    public int coinChange(int[] coins, int amount) {
        int[]dp = new int[amount + 1];
        for (int i = 0; i < dp.length; i ++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 1; i < dp.length; i ++){
            for (int j = 0; j < coins.length; j ++){
                if (i >= coins[j]){
                    dp[i] = Math.min(dp[i - coins[j]] + 1, dp[i]);
                }
            }
        }
        if (dp[amount] == Integer.MAX_VALUE){
            return -1;
        }
        return dp[amount];
    }
}