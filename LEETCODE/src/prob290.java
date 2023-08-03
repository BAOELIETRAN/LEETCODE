import java.util.HashMap;
class prob290 {
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hashMap = new HashMap<>();
        String[]str = s.split(" ");
        if (pattern.length() != str.length){
            return false;
        }
        for (int i = 0; i < pattern.length(); i ++){
            if (hashMap.containsKey(pattern.charAt(i))){
                if (!hashMap.get(pattern.charAt(i)).equals(str[i])){
                    return false;
                }
            }
            else{
                if (hashMap.containsValue(str[i])){
                    return false;
                }
            }
            hashMap.put(pattern.charAt(i), str[i]);
        }
        return true;
    }
}