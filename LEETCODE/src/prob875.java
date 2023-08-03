class prob875 {
    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for (int i = 0; i < piles.length; i ++){
            right = Math.max(piles[i], right);
        }
        while (left < right){
            int mid = (left + right)/2;
            int sum = 0;
            for (int i = 0; i < piles.length; i ++){
                int k = (piles[i] - 1)/mid + 1;
                sum += k;
            }
            if (sum <= h){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}