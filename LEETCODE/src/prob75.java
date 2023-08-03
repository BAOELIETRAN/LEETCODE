public class prob75 {
    public void swap(int[]nums, int p, int q){
        int temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;
    }
    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;
        while (mid <= right){
            if (nums[mid] == 0){
                swap(nums, mid, left);
                mid ++;
                left ++;
            }
            if (nums[mid] == 1){
                mid ++;
            }
            if (nums[right] == 2){
                swap(nums, mid, right);
                right --;
            }
        }
    }
}
