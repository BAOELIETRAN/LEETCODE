public class prob303 {
    class NumArray {
        int []num;
        public NumArray(int[] nums) {
            num = new int[nums.length];
            int sum = 0;
            for (int i = 0; i < num.length; i ++){
                sum += nums[i];
                num[i] = sum;
            }
        }
        
        public int sumRange(int left, int right) {
            int rightSum = num[right];
            int leftSum;
            if (left > 0){
                leftSum = num[left - 1];
            }
            else{
                leftSum = 0;
            }
            return rightSum - leftSum;
        }
    }
    
    /**
     * Your NumArray object will be instantiated and called as such:
     * NumArray obj = new NumArray(nums);
     * int param_1 = obj.sumRange(left,right);
     */
}
