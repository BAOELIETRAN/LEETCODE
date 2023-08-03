class prob2024 {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int[]freq = new int[26];
        int res = 0;
        int left = 0;
        int n = answerKey.length();
        int maxChar = 0;
        for (int right = 0; right < n; right ++){
            char current = answerKey.charAt(right);
            freq[current - 'A'] ++;
            maxChar = Math.max(freq[current - 'A'], maxChar);
            int diff = (right - left + 1) - maxChar;
            if (diff > k){
                freq[answerKey.charAt(left) - 'A'] --;
                left ++;
            }
            res = Math.max(right - left + 1, res);
        }
        return res;
    }   
}