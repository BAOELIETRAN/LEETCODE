class prob1818 {
    private final int MOVDAL = 1000000007;
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int sum = 0;
        int maxReplace = 0;
        for (int i = 0; i < nums1.length; i ++){
            int diff = Math.abs(nums1[i] - nums2[i]);
            sum = (sum + diff)%MOVDAL;
            if (diff > maxReplace && diff != 0){
                for (int j = 0; j < nums1.length; j ++){
                    int replace = diff - Math.abs(nums1[j] - nums2[i]);
                    if (replace > maxReplace){
                        maxReplace = replace;
                        if (Math.abs(nums1[j] - nums2[i]) == 0){
                            break;
                        }
                    }
                }
            }
        }
        int result = sum - maxReplace;
        if (result < 0){
            result += MOVDAL;
        }
        return result % MOVDAL;
    }
}