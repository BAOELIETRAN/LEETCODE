class prob845 {
    public static int longestMountain(int[] arr) {
        if (arr.length <= 2){
            return 0;
        }
        int left = 0;
        int right = 1;
        int fault = 0;
        int res = 0;
        while (right < arr.length){
            if (arr[right] <= arr[left] && right - left == 1){
                left = right;
                right ++;
                continue;
            }
            if (arr[right] == arr[right - 1]){
                fault ++;
            }
            if (right < arr.length - 1){
                if (arr[right] > arr[right - 1] && arr[right] <= arr[right + 1] || arr[right] >= arr[right - 1] && arr[right] >= arr[right + 1] || arr[right] <= arr[right - 1] && arr[right] > arr[right + 1]){
                    right ++;
                }
                else{
                    if (fault == 0){
                        int len = right - left + 1;
                        res = Math.max(len, res);
                    }
                    fault = 0;
                    left = right;
                    right ++;
                }
            }
            if (right == arr.length - 1){
                if (arr[right] >= arr[right - 1]){
                    return res;
                }
                if (fault == 0){
                    int len = right - left + 1;
                    res = Math.max(len, res);
                }
                fault = 0;
                left = right;
                right ++;
            }
        }
        return res;
    }
}