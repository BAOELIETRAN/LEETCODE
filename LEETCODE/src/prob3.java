import java.util.HashMap;
import java.util.Map;
class prob3{
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        for (int right = 0, left = 0; right < s.length(); right ++){
            char currentcharacter = s.charAt(right);
            if (map.containsKey(currentcharacter) && map.get(currentcharacter) >= left){
                left = map.get(currentcharacter) + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            map.put(currentcharacter, right);
        }
        return maxLength;
    }
}