class prob494 {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        target = Math.abs(target);
        if (n <= 1){
            if (target > nums[0] || target < nums[0]){
                return 0;
            }
            return 1;
        }
        int sum = 0;
        for (int num : nums){
            sum += num;
        }
        if ((sum + target) % 2 != 0){
            return 0;
        }
        int value = (sum + target)/2;
        int[][]dp = new int[n + 1][value + 1];      //number of expression de tao thanh tong value tu i so dau tien
        for (int i = 0; i <= n; i ++){
            dp[i][0] = 1;
        }
        for (int res = 0; res <= value; res ++){
            for (int i = 1; i <= n; i ++){
                if (res >= nums[i - 1]){
                    dp[i][res] = dp[i - 1][res] + dp[i - 1][res - nums[i - 1]];
                }
                else{
                    dp[i][res] = dp[i - 1][res];
                }
            }
        }
        return dp[n][value];
    }
}