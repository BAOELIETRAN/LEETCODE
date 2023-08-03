import java.util.HashMap;

class prob2001 {
    public static long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Integer> hashMap = new HashMap<>();
        int count = 0;
        for (int[] rec : rectangles){
            hashMap.put((double)rec[0]/rec[1], hashMap.getOrDefault((double)rec[0]/rec[1], 0) + 1);
        }
        for (long c : hashMap.values()){
            count += c*(c-1)/2;
        }
        return count;
    }
}


//cách dùng hashmap để đếm:
// import java.util.HashMap;

// class Solution {
//     public static long interchangeableRectangles(int[][] rectangles) {
//         HashMap<Double, Integer> hashMap = new HashMap<>();
//         long count = 0;
//         for (int[] rec : rectangles){
//             hashMap.put((double)rec[0]/rec[1], hashMap.getOrDefault((double)rec[0]/rec[1], 0) + 1);
//         }
//         for (int[] rec : rectangles){
//             double value = (double)rec[0]/rec[1];
//             hashMap.put(value, hashMap.get(value) - 1);
//             if (hashMap.get(value) == 0){
//                 hashMap.remove(value);
//             }
//             else{
//                 count += hashMap.get(value);
//             }
//         }
//         return count;
//     }
//     public static void main(String[]args){
//         int[][] rectangles = {{4,5},{7,8}};
//         System.out.println(interchangeableRectangles(rectangles));
//     }
// }