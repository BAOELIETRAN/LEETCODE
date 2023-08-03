class prob1768 {
    public static String mergeAlternately(String word1, String word2) {
        int maxLength = Math.max(word1.length(), word2.length());
        String str = "";
        int index = 0;
        while (index < maxLength){
            if (index < word1.length()){
                str += word1.charAt(index);
            }
            if (index < word2.length()){
                str += word2.charAt(index);
            }
            index ++;
        }
        return str;
    }
}