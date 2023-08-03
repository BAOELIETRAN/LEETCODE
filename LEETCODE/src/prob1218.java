import java.util.HashMap;

class prob1218 {
    public int longestSubsequence(int[] arr, int difference) {
        int n = arr.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        if (n <= 1){
            return n;
        }
        if (n == 2){
            if (arr[1] - arr[0] == difference){
                return 2;
            }
        }
        int[]dp = new int[n];       //do dai day dai nhat tai vi tri n ma moi so cach nhau bang diff
        dp[0] = 1;
        hashMap.put(arr[0], 0);
        for (int i = 1; i < n; i ++){
            dp[i] = 1;
            if (hashMap.containsKey(arr[i] - difference)){
                int index = hashMap.get(arr[i] - difference);
                if (dp[i] < dp[index] + 1){
                    dp[i] = dp[index] + 1;
                }
            }
            hashMap.put(arr[i], i);
        }
        int res = 0;
        for (int i = 0; i < n; i ++){
            if (res < dp[i]){
                res = dp[i];
            }
        }
        return res;
    }
}