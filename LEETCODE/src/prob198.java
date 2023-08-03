class prob198 {
    public static int rob(int[] nums) {
        int n = nums.length;
        if (n == 1){
            return nums[0];
        }
        if (n == 2){
            return Math.max(nums[0], nums[1]);
        }
        if (n == 3){
            return Math.max(nums[0] + nums[2], nums[1]);
        }
        int[]dp = new int[n + 1];
        int res = 0;
        dp[0] = nums[0];
        dp[1] = nums[1];
        dp[2] = nums[0] + nums[2];
        for (int i = 3; i < n; i ++){
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 3] + nums[i]);
        }
        for (int i = 0; i < n; i ++){
            res = Math.max(dp[i], res);
        }
        return res;
    }
}