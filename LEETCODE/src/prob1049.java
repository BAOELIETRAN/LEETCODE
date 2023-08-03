class prob1049 {
    public int lastStoneWeightII(int[] stones) {
        int n = stones.length;
        int sum = 0;
        int nearest_sum = 0;
        for (int num : stones){
            sum += num;
        }
        int origin = sum;
        sum /= 2;
        boolean[][]dp = new boolean[n + 1][sum + 1];
        for (int i = 0; i <= n; i ++){
            dp[i][0] =  true;
        }
        for (int value = 1; value <= sum; value ++){
            for (int i = 1; i <= n; i ++){
                if (value >= stones[i - 1]){
                    dp[i][value] = dp[i - 1][value] || dp[i - 1][value - stones[i - 1]];
                }
                else{
                    dp[i][value] = dp[i - 1][value];
                }
                if (dp[i][value] == true){
                    nearest_sum = Math.max(value, nearest_sum);
                }
            }
        }
        return origin - 2*nearest_sum;
    }
}