class prob647 {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        boolean[][]dp = new boolean[1001][1001];
        for (int i = 0; i < n; i ++){
            dp[i][i] = true;
            if (i < n - 1 && s.charAt(i) == s.charAt(i + 1)){
                dp[i][i + 1] = true;
            }
        }
        for (int i = 2; i < n; i ++){
            for (int j = i - 2; j >= 0; j --){
                if (s.charAt(i) == s.charAt(j)){
                    dp[j][i] = dp[j + 1][i - 1];
                }
            }
        }
        for (int i = 0; i < n; i ++){
            for (int j = 0; j <= i; j ++){
                if (dp[j][i] == true){
                    count ++;
                }
            }
        }
        return count;
    }
}