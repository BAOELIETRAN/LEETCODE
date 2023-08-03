import java.util.Arrays;

class prob1626 {
    public int bestTeamScore(int[] scores, int[] ages) {
        //sorting
        int n = scores.length;
        if (n <= 1){
            return scores[0];
        }
        int[][]teams = new int[n][2];
        for (int i = 0; i < n; i ++){
            teams[i][0] = ages[i];
            teams[i][1] = scores[i];
        }
        Arrays.sort(teams, (a,b) -> (a[0] == b[0])? a[1] - b[1] : a[0] - b[0]);
        int[]dp = new int[n];           //so diem nhieu nhat tai vi tri j --> phai tinh tung vi tri va lay max cua ca day
        dp[0] = teams[0][1];
        for (int j = 1; j < n; j ++){
            dp[j] = teams[j][1];
            for (int i = 0; i < j; i ++){
                if (teams[j][1] >= teams[i][1]){
                    dp[j] = Math.max(dp[i] + teams[j][1], dp[j]);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i ++){
            max = Math.max(dp[i], max);
        }
        return max;
    } 
}