class Solution {
    private boolean increasing(int[]nums){
        for (int i = 1; i < nums.length; i ++){
            if (nums[i] < nums[i - 1]){
                return false;
            }
        }
        return true;
    }
    private boolean decreasing(int[]nums){
        for (int i = 1; i < nums.length; i ++){
            if (nums[i] > nums[i - 1]){
                return false;
            }
        }
        return true;
    }
    public boolean isMonotonic(int[] nums) {
        return increasing(nums) || decreasing(nums);
    }
}