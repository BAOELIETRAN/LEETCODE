import java.util.HashMap;

class prob974 {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int remainder = 0;
        int count = 0;
        hashMap.put(0, 1);
        for (int num : nums){
            remainder = (remainder + num) % k;
            if (remainder < 0){
                remainder += k;
            }
            if (hashMap.containsKey(remainder)){
                count += hashMap.get(remainder);
            }
            hashMap.put(remainder, hashMap.getOrDefault(remainder, 0) + 1);
        }
        return count;
    }
}