class prob977 {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[]arr = new int[nums.length];
        int result_index = nums.length - 1;
        while (left <= right){
            if (nums[left]*nums[left] >= nums[right]*nums[right]){
                arr[result_index] = nums[left]*nums[left];
                left ++;
            }
            else{
                arr[result_index] = nums[right]*nums[right];
                right --;
            }
            result_index --;
        }
        return arr;
    }
}