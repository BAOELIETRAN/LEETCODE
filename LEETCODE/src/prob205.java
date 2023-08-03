import java.util.HashMap;

class prob205 {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hashMap = new HashMap<>();
        if (s.length() != t.length()){
            return false;
        }
        int i = 0;
        while (i < s.length()){
            if (hashMap.containsKey(s.charAt(i))){
                if (hashMap.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            else{
                if (hashMap.containsValue(t.charAt(i))){
                    return false;
                }
            }
            hashMap.put(s.charAt(i), t.charAt(i));
            i ++;
        }
        return true;
    }
}

