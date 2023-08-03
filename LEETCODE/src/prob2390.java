class prob2390 {
    public static String removeStars(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i ++){
            if (s.charAt(i) == '*'){
                if (str.length() == 0){
                    continue;
                }
                else{
                    str.deleteCharAt(str.length() - 1);
                }
            }
            else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}