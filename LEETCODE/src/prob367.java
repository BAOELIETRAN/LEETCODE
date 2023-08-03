class prob367 {
    public static boolean isPerfectSquare(int num) {
        if (num <= 1){
            return true;
        }
        long left = 2;
        long right = num/2;
        while (left <= right){
            long mid = (right + left)/2;
            long correct = mid*mid; 
            if (correct == num){
                return true;
            }
            if (correct < num){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return false;
    }
}