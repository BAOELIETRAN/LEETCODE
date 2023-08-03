class prob150 {
    public static int evalRPN(String[] tokens) {
        String[]stack = new String[10000];
        int top = -1;
        for (String num : tokens){
            if (top >= 1 && num.equals("*") || num.equals("/") || num.equals("-") || num.equals("+")){
                int a = Integer.parseInt(stack[top]);
                top --;
                int b = Integer.parseInt(stack[top]);
                top --;
                if (num.equals("*")){
                    top ++;
                    stack[top] = String.valueOf(a * b);
                }
                else if (num.equals("/")){
                    top ++;
                    stack[top] = String.valueOf(b / a);
                }
                else if (num.equals("-")){
                    top ++;
                    stack[top] = String.valueOf(b - a);
                }
                else if (num.equals("+")){
                    top ++;
                    stack[top] = String.valueOf(a + b);
                }
            }
            else{
                top ++;
                stack[top] = num;
            }
        }
        int value = Integer.parseInt(stack[top]);
        return value;
    }
}