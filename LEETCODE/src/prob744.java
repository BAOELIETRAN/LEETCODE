import java.util.HashMap;
class prob744 {
    public static char nextGreatestLetter(char[] letters, char target) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : letters){
            hashMap.put(c, c - 0);
        }
        for (char c : letters){
            if (hashMap.get(c) > target - 0){
                return c;
            }
        }
        return letters[0];
    }
}