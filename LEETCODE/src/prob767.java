import java.util.HashMap;

class prob767 {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : s.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        int maxCount = 1;
        char maxCharCount = 'a';
        for (char c : s.toCharArray()){
            if (hashMap.get(c) >= maxCount){
                maxCount = hashMap.get(c);
                maxCharCount = c;
            }
        }
        if (maxCount > (s.length() + 1)/2){
            return "";
        }
        char[]result = new char[s.length()];
        int num = 0;
        for (int i = 0; i < maxCount; i ++){
            result[num] = maxCharCount;
            num += 2;
        }
        hashMap.remove(maxCharCount);
        for (char c : hashMap.keySet()){
            int count = hashMap.get(c);
            while (count > 0){
                if (num >= s.length()){
                    num = 1;
                }
                result[num] = c;
                num += 2;
                count --;
            }
        }
        String str = new String(result);
        return str;
    }
}