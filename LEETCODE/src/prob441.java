class prob441 {
    public int arrangeCoins(int n) {
        int count = 0;
        long left = 1;
        long right = n;
        while (left <= right){
            int mid = (int) ((left + right) / 2);
            long sum = (long) ((mid / 2.0) * (mid + 1));
            if (sum > n){
                right = mid - 1;
            }
            else{
                count = Math.max(count, mid);
                left = mid + 1;
            }
        }
        return count;
    }
}