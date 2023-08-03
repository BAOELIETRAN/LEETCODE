class prob1911 {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[][]dp = new long[n][2];        //alternate sum tai tung vi tri trong nums, voi nums[i] co vi tri chan hoac le trong subsequence moi
        for (int i = 0; i < n; i ++){
            dp[i][0] = nums[i];
        }
        long curChan = 0;
        long curLe = 0;
        for (int i = 0; i < n; i ++){
            dp[i][0] = Math.max(curChan, curLe + nums[i]);
            dp[i][1] = Math.max(curLe, curChan - nums[i]);
            curChan = Math.max(dp[i][0], curChan);
            curLe = Math.max(dp[i][1], curLe);
        }
        long res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i ++){
            res = Math.max(dp[i][0], res);
        }
        return res;
    }
}