import java.util.Stack;

class prob402 {
    public static String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<>();
        stack.push(num.charAt(0) - '0');
        for (int i = 1; i < num.length(); i ++){
            int current = num.charAt(i) - '0';
            while (!stack.isEmpty() && k > 0 && current < stack.peek()){
                stack.pop();
                k --;
            }
            stack.push(current);
        }
        if (k > 0){
            for (int i = 0; i < k; i ++){
                stack.pop();
            }
        }
        StringBuilder str = new StringBuilder();
        for (int var : stack){
            str.append(var);
        }
        if (str.length() == 0){
            return "0";
        }
        while (str.charAt(0) == '0' && str.length() > 1){
            str.deleteCharAt(0);
        }
        return str.toString();
    }
    public static void main(String[]args){
        String num = "10200";
        int k = 1;
        System.out.println(removeKdigits(num, k));
    }
}