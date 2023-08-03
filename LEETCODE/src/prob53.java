class prob53 {
    public int maxSubArray(int[] nums) {
        int curMax = 0;
        int maxTillNow = Integer.MIN_VALUE;
        for (int num : nums){
            curMax = Math.max(curMax + num, num);
            maxTillNow = Math.max(curMax, maxTillNow);
        }
        return maxTillNow;
    }
}