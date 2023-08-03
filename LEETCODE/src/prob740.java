class prob740 {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int num : nums){
            if (num > max){
                max = num;
            }
        }
        int[]bucket = new int[max + 1];
        for (int num : nums){
            bucket[num] += num;
        }
        int[]dp = new int[max + 1];
        dp[0] = bucket[0];
        dp[1] = bucket[1];
        for (int i = 2; i <= max; i ++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + bucket[i]);
        }
        return dp[max];
    }
}