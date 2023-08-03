class prob26 {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 1;
        while (right < nums.length){
            if (nums[left] != nums[right]){
                left ++;
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            right ++;
        }
        return left;
    }
}