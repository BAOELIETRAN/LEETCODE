class prob852 {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        if (arr.length == 1){
            return 0;
        }
        while (left <= right) {
            int mid = (left + right)/2;
            if (mid == 0){
                left = mid + 1;
            }
            else if (mid == arr.length - 1){
                right = mid - 1;
            }
            else{
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                    return mid;
                }
                if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
        }
        return left;
    }
}