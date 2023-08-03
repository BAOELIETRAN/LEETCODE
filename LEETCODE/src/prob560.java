import java.util.HashMap;

class prob560 {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;
        int sum = 0;
        hashMap.put(0, 1);
        for (int num : nums){
            sum += num;
            int prefix_sum = sum - k;
            if (hashMap.containsKey(prefix_sum)){
                count += hashMap.get(prefix_sum);
            }
            hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}