class prob540 {
    public static int singleNonDuplicate(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        int left = 0;
        int right = nums.length - 1;
        if (nums[left] != nums[left + 1]){
            return nums[left];
        }
        if (nums[right] != nums[right - 1]){
            return nums[right];
        }
        while (left < right){
            int mid = (left + right)/2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
                return nums[mid];
            }
            if (nums[mid] == nums[mid - 1]){
                if ((mid - left + 1)% 2 == 0){
                    left = mid + 1;
                }
                else{
                    right = mid;
                }
            }
            else{
                if ((right - mid + 1)% 2 == 0){
                    right = mid - 1;
                }
                else{
                    left = mid;
                }
            }
        }
        return nums[left];
    }
}