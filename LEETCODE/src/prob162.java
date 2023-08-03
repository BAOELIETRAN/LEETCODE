class prob162 {
    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        if (nums.length == 1){
            return 0;
        }
        while (left <= right){
            int mid = (left + right)/2;
            if (mid == 0){
                if (nums[mid + 1] < nums[mid]){
                    return mid;
                }
            }
            if (mid == nums.length - 1){
                if (nums[mid] > nums[mid - 1]){
                    return mid;
                }
            }
            if (mid > 0 && nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if (nums[mid] < nums[mid + 1]){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return left;
    }
}