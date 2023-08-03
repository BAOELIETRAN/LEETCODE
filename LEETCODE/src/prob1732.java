class prob1732 {
    public int largestAltitude(int[] gain) {
        int[]arr = new int[gain.length + 1];
        arr[0] = 0;
        int res = 0;
        for (int i = 1; i < arr.length; i ++){
            arr[i] = arr[i - 1] + gain[i - 1];
            res = Math.max(arr[i], res);
        }
        return res;
    }
}