class prob309 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int [][]dp = new int[n + 1][3];   //so tien thu duoc sau khi xu ly i thang dau tien voi trang thai j
        int cooldown = 0; 
        int buy = 1;
        int sell = 2;
        for (int i = 0; i <= n; i ++){
            if (i == 0){
                dp[i][cooldown] = 0;
                dp[i][buy] = - prices[i];
                dp[i][sell] = 0;
            }
            else{
                dp[i][cooldown] = Math.max(dp[i - 1][buy], dp[i - 1][sell]);
                dp[i][buy] = Math.max(dp[i - 1][cooldown] - prices[i - 1], dp[i - 1][buy]);
                dp[i][sell] = Math.max(dp[i - 1][buy] + prices[i - 1], dp[i - 1][sell]);
            }
        }
        return Math.max(dp[n][cooldown], dp[n][sell]);
    }
}