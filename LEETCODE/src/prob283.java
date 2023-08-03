class prob283 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        int i = 0;
        while (i < nums.length){
            if (nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index ++;
            }
            i ++;
        }
    }
}