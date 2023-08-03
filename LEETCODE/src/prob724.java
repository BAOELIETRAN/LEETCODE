public class prob724 {
    public static int pivotIndex(int[] nums) {
        int nums_sum = 0;
        for (int i = 0; i < nums.length; i ++){
            nums_sum += nums[i];
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i ++){
            nums_sum -= nums[i];
            if (nums_sum == sum){
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}
