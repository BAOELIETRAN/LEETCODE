public class prob496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[]res = new int[nums1.length];
        int count = 0;
        for (int num: nums1){
            res[count ++] = ans(num, nums2); 
        }
        return res;
    }
    private int ans(int n, int[]nums){
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] == n){
                for (int j = i + 1; j < nums.length; j ++){
                    if (nums[j] > n){
                        return nums[j];
                    }
                }
            }
        }
        return -1;
    }
}
