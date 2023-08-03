class prob518 {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][]dp = new int[n + 1][amount + 1]; //so combination co tong bang amout trong i thang dau tien
        for (int i = 0; i <= n; i ++){
            dp[i][0] = 1;
        }
        for (int sum = 1; sum <= amount; sum ++){
            for (int i = 1; i <= n; i ++){
                if (sum >= coins[i - 1]){
                    dp[i][sum] = dp[i - 1][sum] + dp[i][sum - coins[i - 1]];
                }
                else{
                    dp[i][sum] = dp[i - 1][sum];
                }
            }
        }
        return dp[n][amount];
    }
}


// class prob518 {
//     public int change(int amount, int[] coins) {
//         int[]dp = new int[amount + 1];
//         dp[0] = 1;
//         for (int coin : coins){
//             for (int sum = 1; sum <= amount; sum ++){
//                 if (sum >= coin){
//                     dp[sum] += dp[sum - coin];
//                 }
//             }
//         }
//         return dp[amount];
//     }
// }