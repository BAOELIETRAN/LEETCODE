class prob1524 {
    public static int numOfSubarrays(int[] arr) {
        int[]prefix = new int[arr.length + 1];
        prefix[0] = 0;
        int evenCount = 0;
        int oddCount = 0;
        int count = 0;
        int M = 1000000007;
        for (int i = 1; i < prefix.length; i ++){
            prefix[i] = prefix[i - 1] + arr[i - 1]; 
        }
        for (int sum : prefix){
            if (sum % 2 == 1){
                count = (count + evenCount)%M;
                oddCount ++;
            }
            else{
                count = (count + oddCount)%M;
                evenCount ++;
            }
        }
        return count;
    }
}