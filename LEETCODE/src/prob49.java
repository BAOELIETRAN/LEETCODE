import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class prob49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> list_array = new ArrayList<>();
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (int i = 0; i < strs.length; i ++){
            char []tempArray = strs[i].toCharArray();
            Arrays.sort(tempArray);
            String str = new String(tempArray);
            if (hashMap.containsKey(str)){
                List<String> list = hashMap.get(str);
                list.add(strs[i]);
                hashMap.put(str, list);
            }
            else{
                List<String> list = new ArrayList<>(Arrays.asList());
                list.add(strs[i]);
                hashMap.put(str, list);
            }
        }
        for (Map.Entry<String, List<String>> entry: hashMap.entrySet()){
            List<String> list = entry.getValue();
            list_array.add(list);
        }
        return list_array;
    }
}