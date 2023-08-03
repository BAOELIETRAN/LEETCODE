import java.util.Stack;

class prob946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int val : pushed){
            stack.push(val);
            while (!stack.isEmpty() && stack.peek() == popped[index]){
                stack.pop();
                index ++;
            }
        }
        return stack.isEmpty();
    }
}

//Cách nhanh hơn:


// class Solution {
//     public boolean validateStackSequences(int[] pushed, int[] popped) {
//         int top = -1;
//         int index = 0;
//         for (int num : pushed){
//             top ++;
//             pushed[top] = num;
//             while (top >= 0 && pushed[top] == popped[index]){
//                 top--;
//                 index ++;
//             }
//         }
//         return top <= 0;
//     }
// }