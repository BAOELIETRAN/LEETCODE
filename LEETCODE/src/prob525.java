import java.util.HashMap;

class prob525 {
    public static int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) { // Base Case
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int res = 0;
        int sum = 0;
        hashMap.put(0, -1);
        for (int i = 0; i < nums.length; i ++){
            sum += nums[i];
            if (hashMap.containsKey(sum)){
                int k = hashMap.get(sum);
                int len = i - k;
                res = Math.max(len, res);
            }
            else{
                hashMap.put(sum, i);
            }
        }
        return res;
    }
}