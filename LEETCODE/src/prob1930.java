import java.util.HashMap;
import java.util.HashSet;
class prob1930 {
    public static int countPalindromicSubsequence(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < s.length(); i ++){
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        HashSet<String> res = new HashSet<>();
        for (int mid = 0; mid < s.length(); mid ++){
            char c = s.charAt(mid);
            hashMap.put(c, hashMap.get(c) - 1);
            if (hashMap.get(c) == 0){
                hashMap.remove(c);
            }
            for (int i = 0; i < 26; i ++){
                if (hashSet.contains((char)('a' + i)) && hashMap.containsKey((char)('a' + i))){
                    res.add("" + (char)('a' + i) + c + (char)('a' + i));
                }
            }
            hashSet.add(c);
        }
        return res.size();
    }
}