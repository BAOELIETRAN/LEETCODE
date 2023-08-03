class prob14{
    public static String longestCommonPrefix(String[] strs){
        String res = "";
        for (int i = 0; i < strs[0].length(); i ++){
            for (int j = 0; j < strs.length; j ++){
                if (i == strs[0].length() || strs[0].charAt(i) != strs[j].charAt(i)){
                    return res;
                }
            }
            res += strs[0].charAt(i);
        }
        return res;
    }
}

//Cách này hơi dài, nhưng mà thời gian chạy là O(n*k) --> O(n)
// class prob14 {
//     public static String longestCommonPrefix(String[] strs) {
//         if (strs.length == 0){
//             return "";
//         }
//         if (strs.length == 1){
//             return strs[0];
//         }
//         String s = strs[0];
//         String str = "";
//         String str1 = "";
//         for (int j = 0; j < s.length(); j ++){
//             for (int i = 0; i < strs.length; i ++){
//                 if (j < strs[i].length() && strs[i].charAt(j) == s.charAt(j)){
//                     str = s.charAt(j) + "";
//                 }
//                 else{
//                     str = "";
//                     break;
//                 }
//             }
//             if (str == ""){
//                 return str1;
//             }
//             str1 += str;
//         }
//         return str1;
//     }
// }