class prob567 {
    public static boolean checkInclusion(String s1, String s2) {
        int[]arr = new int[26];
        int left = 0;
        for (int i = 0; i < s1.length(); i ++){
            arr[s1.charAt(i) - 'a'] ++;
        }
        for (int right = 0; right < s2.length(); right ++){
            arr[s2.charAt(right) - 'a'] --;
            while (arr[s2.charAt(right) - 'a'] < 0){
                arr[s2.charAt(left) - 'a'] ++;
                left ++;
            }
            if (right - left + 1 == s1.length()){
                return true;
            }
        }
        return false;
    }
}