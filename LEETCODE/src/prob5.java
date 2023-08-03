public class prob5 {
    public String longestPalindrom (String s){
        String str = "";
        int resLen = 0;
        for (int i = 0; i < s.length(); i ++){
            int l = i;
            int r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if (l - r + 1 > resLen){
                    str = s.substring(l, r + 1);
                    resLen = r - l + 1;
                }
                l -= 1;
                r += 1;
            }
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if (l - r + 1 > resLen){
                    str = s.substring(l, r + 1);
                    resLen = r - l + 1;
                }
                l -= 1;
                r += 1;
            }
        }
        return str;
    }
}

// class Solution {
//     public String longestPalindrome(String s) {
//         int n = s.length();
//         boolean[][]dp = new boolean[1001][1001];
//         int res = 0;
//         int index = 0;
//         for (int i = 0; i < n; i ++){
//             dp[i][i] = true;
//             if (i < n - 1 && s.charAt(i) == s.charAt(i + 1)){
//                 dp[i][i + 1] = true;
//             }
//         }
//         for (int i = 2; i < n; i ++){
//             for (int j = i - 2; j >= 0; j --){
//                 if (s.charAt(j) == s.charAt(i)){
//                     dp[j][i] = dp[j + 1][i - 1];
//                 }
//             }
//         }
//         for (int i = 0; i < n; i ++){
//             for (int j = 0; j <= i; j ++){
//                 if (dp[j][i] == true){
//                     if (i - j + 1 > res){
//                         res = i - j + 1;
//                         index = i;
//                     }
//                 }
//             }
//         }
//         return s.substring(index - res + 1, index + 1);
//     }
// }