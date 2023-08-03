import java.util.HashSet;

class prob219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i ++){
            if (hashSet.contains(nums[i])){
                return true;
            }
            if (i >= k){
                hashSet.remove(nums[i - k]);
            }
            hashSet.add(nums[i]);
        }
        return false;
    }
}