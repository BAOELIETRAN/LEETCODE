// Follow up : O(n) time and space
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
class prob347 {
    public static int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int n : nums){
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        for (int key : frequencyMap.keySet()){
            int frequency = frequencyMap.get(key);
            if (bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        int []res = new int[k];
        int count = 0;
        for (int pos = bucket.length - 1; pos >= 0 && count < k; pos --){
            if (bucket[pos] != null){
                for (Integer integer : bucket[pos]){
                    res[count ++] = integer;
                }
            }
        }
        return res;
    }
}


// Cách naive: O(nlogn)
// import java.util.HashMap;
// import java.util.PriorityQueue;
// class prob347 {
//     public static int[] topKFrequent(int[] nums, int k) {
//         HashMap<Integer, Integer> hashMap = new HashMap<>();
//         int []arr = new int[k];
//         for (int i = 0; i < nums.length; i ++){
//             int count = 1;
//             if (hashMap.containsKey(nums[i])){
//                 count = hashMap.get(nums[i]);
//                 count ++;
//             }
//             hashMap.put(nums[i], count);
//         }
//         PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->hashMap.get(b) - hashMap.get(a));
//         queue.addAll(hashMap.keySet());
//         for (int i = 0; i < k; i ++){
//             int num = queue.poll();
//             arr[i] = num;
//         }
//         return arr;
//     }
// }