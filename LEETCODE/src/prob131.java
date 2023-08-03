import java.util.ArrayList;
import java.util.List;

public class prob131 {

    private boolean isPalindrome(String s, int n){
        for (int i = 0; i < n/2; i ++){
            if (s.charAt(i) != s.charAt(n - i - 1)){
                return false;
            }
        }
        return true;
    }

    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        if (s.equals("")){
            list.add(new ArrayList<>());
            return list;
        }
        for (int i = 0; i < s.length(); i ++){
            if (isPalindrome(s, i + 1)){
                for (List<String> value : partition(s.substring(i + 1))){
                    value.add(0, s.substring(0, i + 1));
                    list.add(value);
                }
            }
        }
        return list;
    }
}
