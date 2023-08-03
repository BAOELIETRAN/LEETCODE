class prob1011 {
    public static int shipWithinDays(int[] weights, int days) {
        int sum_array = 0;
        int max = 0;
        for (int i = 0; i < weights.length; i ++){
            sum_array += weights[i];
            max = Math.max(weights[i], max);
        }
        int left = 1;
        int right = sum_array;
        while (left < right){
            int mid = (left + right)/2;
            int sum = 0;
            int count = 0;
            for (int i = 0; i < weights.length; i ++){
                if (sum + weights[i] > mid){
                    sum = weights[i];
                    count ++;
                }
                else{
                    sum += weights[i];
                }
            }
            count ++;
            if (count <= days){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        if (left < max){
            return max;
        }
        return left;
    }
}

