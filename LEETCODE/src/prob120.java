import java.util.List;

class prob120 {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[]dp = new int[n + 1];
        for (int row = n - 1; row >= 0; row --){
            for (int col = 0; col <= row; col ++){
                dp[col] = triangle.get(row).get(col) + Math.min(dp[col], dp[col + 1]);
            }
        }
        return dp[0];
    }
}