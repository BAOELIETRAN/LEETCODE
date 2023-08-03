class prob377 {
    public int combinationSum4(int[] nums, int target) {
        int n = nums.length;
        int[]dp = new int[target + 1];
        dp[0] = 1;
        for (int sum = 1; sum <= target; sum ++){
            for (int i = 1; i <= n; i ++){
                if (sum >= nums[i - 1]){
                    dp[sum] += dp[sum - nums[i - 1]];
                }
            }
        }
        return dp[target];
    }
}
