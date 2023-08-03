import java.util.Arrays;

class prob983 {
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int[]dp = new int[366]; //so tien it nhat de di vao ngay thu i
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        int index = 0;
        for (int i = 1; i <= 365; i ++){
            if (index < n && i == days[index]){
                dp[i] = Math.min(dp[i - 1] + costs[0], dp[i]);
                if (i >= 7){
                    dp[i] = Math.min(dp[i - 7] + costs[1], dp[i]);
                }
                else{
                    dp[i] = Math.min(dp[i], costs[1]);
                }
                if (i >= 30){
                    dp[i] = Math.min(dp[i - 30] + costs[2], dp[i]);
                }
                else{
                    dp[i] = Math.min(dp[i], costs[2]);
                }
                index ++;
            }
            else{
                dp[i] = dp[i - 1];
            }
        }
        return dp[365];
    }
}