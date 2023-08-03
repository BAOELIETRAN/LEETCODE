import java.util.Arrays;

class prob877 {
    public boolean stoneGame(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length;
        if (n <= 2){
            return true;
        }
        int[]dp = new int[n + 1];
        dp[1] = piles[0];
        dp[2] = piles[1];
        for (int i = 3; i <= n; i ++){
            dp[i] = piles[i - 1] + dp[i - 2];
        }
        return dp[n] > dp[n - 1];
    }
}