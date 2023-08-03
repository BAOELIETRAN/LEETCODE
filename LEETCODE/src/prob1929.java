class prob1929 {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int []gaylord = new int[2*n];
        for (int i = 0; i < n; i ++){
            gaylord[i] = nums[i];
        }
        for (int i = n; i < 2*n; i ++){
            gaylord[i] = nums[i - n];
        }
        return gaylord;
    }
}