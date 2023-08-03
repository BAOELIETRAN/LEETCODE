public class prob268 {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int[]res = new int[n + 1];
        for (int num : nums){
            res[num] ++;
        }
        for (int i = 0; i <= n; i ++){
            if (res[i] == 0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[]args){
        int[]nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
}
