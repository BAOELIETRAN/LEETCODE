import java.util.HashMap;

class prob1027 {
    public int longestArithSeqLength(int[] nums) {
        int ans = 0;
        int n = nums.length;
        if (n <= 2){
            return n;
        }
        HashMap<Integer, Integer>[] hashMap = new HashMap[n];
        for (int i = 0; i < n; i ++){
            hashMap[i] = new HashMap<>();
            for (int j = 0; j < i; j ++){
                int diff = nums[i] - nums[j];
                hashMap[i].put(diff, hashMap[j].getOrDefault(diff, 1) + 1);
                ans = Math.max(hashMap[i].get(diff), ans);
            }
        }
        return ans;
    }
}