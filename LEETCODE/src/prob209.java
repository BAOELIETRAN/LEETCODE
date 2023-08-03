class prob209 {
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        int count = 0;
        int sum = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right ++){
            sum += nums[right];
            count ++;
            while (sum >= target){
                res = Math.min(count, res);
                sum -= nums[left];
                left ++;
                count --;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
