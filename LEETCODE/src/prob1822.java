public class prob1822 {
    public static int arraySign(int[] nums) {
        int count_negative = 0;
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] < 0){
                count_negative ++;
            }
            if (nums[i] == 0){
                return 0;
            }
        }
        if (count_negative % 2 == 0){
            return 1;
        }
        if (count_negative % 2 == 1){
            return -1;
        }
        return 0;
    }
}
