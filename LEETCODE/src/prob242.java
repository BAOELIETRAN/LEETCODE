import java.util.HashMap;

class prob242 {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashMap_s = new HashMap<>();
        HashMap<Character, Integer> hashMap_t = new HashMap<>();
        if (s.length() != t.length()){
            return false;
        }
        for (int i = 0; i < s.length(); i ++){
            int count = 1;
            if (hashMap_s.containsKey(s.charAt(i))){
                count = hashMap_s.get(s.charAt(i));
                count ++;
            }
            hashMap_s.put(s.charAt(i), count);
        }
        for (int i = 0; i < t.length(); i ++){
            int count = 1;
            if (hashMap_t.containsKey(t.charAt(i))){
                count = hashMap_t.get(t.charAt(i));
                count ++;
            }
            hashMap_t.put(t.charAt(i), count);
        }
        for (int i = 0; i < s.length(); i ++){
            if (!hashMap_s.get(s.charAt(i)).equals(hashMap_t.get(s.charAt(i)))) {
                return false;
            }            
        }
        return true;
    }
}