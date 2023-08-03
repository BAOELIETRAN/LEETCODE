class prob1343 {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        int left = 0;
        for (int right = 0; right < arr.length; right ++){
            sum += arr[right];
            if (right - left + 1 >= k){
                if (right - left + 1 == k){
                    if ((sum / k) >= threshold){
                        count ++;
                    }
                }
                sum -= arr[left];
                left ++;
            }
        }
        return count;
    }
}