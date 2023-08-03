class prob213 {
    public static int rob(int[] nums) {
        int n = nums.length;
        if (n == 1){
            return nums[0];
        }
        if (n == 2){
            return Math.max(nums[0], nums[1]);
        }
        if (n == 3){
            int res = 0;
            for (int i = 0; i < 3; i ++){
                res = Math.max(nums[i], res);
            }
            return res;
        }
        if (n == 4){
            return Math.max(nums[0] + nums[2], nums[1] + nums[3]);
        }
        int[]dp = new int[n];
        int res = 0;
        dp[0] = nums[0];
        dp[1] = nums[1];
        dp[2] = nums[0] + nums[2];
        for (int i = 3; i < n - 1; i ++){
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 3] + nums[i]);
        }
        for (int i = 0; i < n; i ++){
            res = Math.max(dp[i], res);
        }
        int[]dp1 = new int[n + 1];
        int res1 = 0;
        dp1[1] = nums[1];
        dp1[2] = nums[2];
        dp1[3] = nums[1] + nums[3];
        for (int i = 4; i < n; i ++){
            dp1[i] = Math.max(dp1[i - 2] + nums[i], dp1[i - 3] + nums[i]);
            System.out.println(dp1[i]);
        }
        for (int i = 0; i <= n; i ++){
            res1 = Math.max(dp1[i], res1);
        }
        return Math.max(res1, res);
    }
}