import java.util.Arrays;

class prob1984 {
    public static int minimumDifference(int[] nums, int k) {
        if (k > nums.length){
            return 0;
        }
        Arrays.sort(nums);
        int left = 0;
        int right = k - 1;
        int minimumDifference = nums[nums.length - 1];
        while (right < nums.length){
            minimumDifference = Math.min(nums[right] - nums[left], minimumDifference);
            left ++;
            right ++;
        }
        return minimumDifference;
    }
}