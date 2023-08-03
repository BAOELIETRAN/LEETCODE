class prob416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums){
            sum += num;
        }
        if (sum % 2 == 0){
            sum /= 2;
            int n = nums.length;
            boolean[][]dp = new boolean[n + 1][sum + 1];
            for (int i = 1; i <= n; i ++){
                dp[i][0]= true;
            }
            for (int value = 1; value <= sum; value ++){
                for (int i = 1; i <= n; i ++){
                    dp[i][value] = dp[i - 1][value];
                    if (value >= nums[i]){
                        dp[i][value] = dp[i][value] || dp[i - 1][value - nums[i]];
                    }
                }
            } 
            return dp[n][sum];
        }
        return false;
    }
}