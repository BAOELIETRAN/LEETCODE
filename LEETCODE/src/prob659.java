import java.util.ArrayList;
import java.util.List;

public class prob659 {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public static String encode(List<String> strs) {
        // write your code here
        StringBuilder ans = new StringBuilder();
        for (String str : strs){
            ans.append((char) str.length()).append(str);
        }
        return ans.toString();
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public static List<String> decode(String str) {
        // write your code here
        List<String> list = new ArrayList<String>();
        int n = str.length();
        int i = 0; 
        while (i < n){
            int size = str.charAt(i);
            i ++;
            list.add(str.substring(i, i + size));
            i += size;
        }
        return list;
    }
}