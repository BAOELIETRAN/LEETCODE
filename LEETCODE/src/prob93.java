class prob93 {
    public int lengthOfLIS(int[] nums) {
        int res = 0;
        int n = nums.length;
        int[]dp = new int[10000];
        dp[0] = 1;
        for (int i = 1; i < n; i ++){
            dp[i] = 1;
            for (int j = 0; j < i; j ++){
                if (nums[i] > nums[j]){
                    if (dp[i] < dp[j] + 1){
                        dp[i] = dp[j] + 1;
                    }
                }
            }
        }
        for (int i = 0; i <= n; i ++){
            if (res < dp[i]){
                res = dp[i];
            }
        }
        return res;
    }
}