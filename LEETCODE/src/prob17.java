import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class prob17 {
    private Map<Character, String> digitToChar = Map.of(
        '2', 
        "abc", 
        '3', 
        "def", 
        '4', 
        "ghi", 
        '5', 
        "jkl", 
        '6', 
        "mno", 
        '7', 
        "pqrs", 
        '8', 
        "tuv", 
        '9', 
        "wxyz"
    );

    private void backtrack(int index, String digits, String cur, List<String> ans){
        if (cur.length() == digits.length()){
            ans.add(cur);
            return;
        }
        if (index >= digits.length()){
            return;
        }
        String digit = digitToChar.get(digits.charAt(index));
        for (char c : digit.toCharArray()){
            backtrack(index + 1, digits, cur + c, ans);
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0){
            return new ArrayList<>();
        }
        List<String> ans = new ArrayList<>();
        backtrack(0, digits, "", ans);
        return ans;
    }
}