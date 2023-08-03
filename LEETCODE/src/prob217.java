import java.util.HashMap;
class prob217 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i ++){
            int count = 0;
            if (hashMap.containsKey(nums[i])){
                count ++;
            }
            hashMap.put(nums[i], count);
        }
        for (int i = 0; i < nums.length; i ++){
            if (hashMap.get(nums[i]) > 0){
                return true;
            }
        }
        return false;
    }
}