class prob27 {
    public int removeElement(int[] nums, int val) {
        int curIndex = 0;
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] != val){
                int temp = nums[i];
                nums[i] = nums[curIndex];
                nums[curIndex] = temp;
                curIndex ++;
            }
        }
        return curIndex;
    }
}