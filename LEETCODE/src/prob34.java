class prob34 {
    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0){
            int []arr = {-1,-1};
            return arr;
        }
        int[]arr = new int[2];
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int mid = (left + right)/2;
            if (nums[mid] >= target){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        if (nums[left] != target){
            int []arr1 = {-1,-1};
            return arr1;
        }
        arr[0] = left;
        left = 0;
        right = nums.length - 1;
        while (left <= right){
            int mid = (left + right)/2;
            if (nums[mid] <= target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        arr[1] = right;
        return arr;
    }  
}