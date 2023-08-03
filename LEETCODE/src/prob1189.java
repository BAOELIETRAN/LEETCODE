// Cách thông minh hơn:
class prob1189 {
    public static int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0, count = 0;
        for (char c : text.toCharArray()){
            if (c == 'a'){
                a ++;
            }
            if (c == 'b'){
                b ++;
            }
            if (c == 'l'){
                l ++;
            }
            if (c == 'o'){
                o ++;
            }
            if (c == 'n'){
                n ++;
            }
            if (b >= 1 && a >= 1 && l >= 2 && o >= 2 && n >= 1){
                count ++;
                a --;
                b --;
                l -= 2;
                o -= 2;
                n --;
            }
        }
        return count;  
    }
}




// Cách naive
// import java.util.HashMap;
// import java.util.PriorityQueue;
// class prob1189 {
//     public static int maxNumberOfBalloons(String text) {
//         HashMap<Character, Integer> hashMap_text = new HashMap<>();
//         HashMap<Character, Integer> hashMap_balloons = new HashMap<>();
//         PriorityQueue<Integer> queue = new PriorityQueue<>();
//         String balloons = "balloon";
//         for (int i = 0; i < balloons.length(); i ++){
//             int count = 1;
//             if (hashMap_balloons.containsKey(balloons.charAt(i))){
//                 count = hashMap_balloons.get(balloons.charAt(i));
//                 count ++;
//             }
//             hashMap_balloons.put(balloons.charAt(i), count);
//         }
//         for (int i = 0; i < text.length(); i ++){
//             if (hashMap_balloons.containsKey(text.charAt(i))){
//                 int count = 1;
//                 if (hashMap_text.containsKey(text.charAt(i))){
//                     count = hashMap_text.get(text.charAt(i));
//                     count ++;
//                 }
//                 hashMap_text.put(text.charAt(i), count);
//             }
//         }
//         for (int i = 0; i < balloons.length(); i ++){
//             Integer k = hashMap_text.get(balloons.charAt(i));
//             if (k == null){
//                 k = 0;
//             }
//             else{
//                 k = (int)hashMap_text.get(balloons.charAt(i));
//             }
//             int q = (int)hashMap_balloons.get(balloons.charAt(i));
//             queue.offer(k/q);
//         }
//         return queue.poll();
//     }
//     public static void main(String[]args){
//         String str = "leetcode";
//         System.out.println(maxNumberOfBalloons(str));
//     }
// }