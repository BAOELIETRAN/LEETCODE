class prob91 {
    public int numDecodings(String s) {
        int[]dp = new int[1001];
        int n = s.length();
        s = " " + s;
        dp[0] = 1;
        for (int i = 1; i <= n; i ++){
            if (s.charAt(i) != '0'){
                dp[i] += dp[i - 1];
            }
            if (i >= 2){
                int value = Integer.parseInt(s.substring(i - 1, i + 1));
                if (value >= 10 && value <= 26){
                    dp[i] += dp[i - 2];
                }
            }
        }
        return dp[n];
    }
}