import java.util.HashMap;
import java.util.List;

class prob139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String, Boolean> hashMap = new HashMap<>();
        for (String value : wordDict){
            hashMap.put(value, true);
        }
        int n = s.length();
        boolean[]dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i ++){
            for (int j = 0; j < i; j ++){
                if (hashMap.containsKey(s.substring(j, i))){
                    if (dp[j] == true){
                        dp[i] = dp[j];
                        break;
                    }
                }
            }
        }
        return dp[n];
    }
}