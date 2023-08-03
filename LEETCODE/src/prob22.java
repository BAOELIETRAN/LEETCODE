import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class prob22 {
    List<String> res = new ArrayList<>();
    char[]arr = new char[100];
    char[]candidate = {'(', ')'};
    int[]count = {0,0};
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (!stack.isEmpty() && ((stack.peek() == '(' && c == ')'))){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
    private void backtrack(int i, int n, int k){
        for (int index = 0; index < 2; index++){
            if (count[index] < n){
                arr[i] = candidate[index];
                count[index] ++;
                if (i == k - 1){
                    String str = new String(arr, 0, k);
                    if (isValid(str)) {
                        res.add(str);
                    }
                }
                else{
                    backtrack(i + 1, n, k);
                }
                count[index] --;
            }
        }
    }
    public List<String> generateParenthesis(int n) {
        backtrack(0, n, n*2);
        return res;
    }
}
