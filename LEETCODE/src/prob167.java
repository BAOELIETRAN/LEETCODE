class prob167 {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[]arr = new int[2];
        while (left < right){
            int sum = numbers[left] + numbers[right];
            if (sum > target){
                right --;
            }
            else if (sum < target){
                left ++;
            }
            else{
                arr[0] = left;
                arr[1] = right;
                break;
            }
        }
        return arr;
    }
}