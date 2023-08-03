import java.util.HashMap;
class prob128 {
    public int longestConsecutive(int[] nums) {
        int longestLength = 0;
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i ++){
            hashMap.put(nums[i], false);
        }

        for (int i = 0; i < nums.length; i ++){
            int currentLength = 1;
            int nextNum = nums[i] + 1;
            while (hashMap.containsKey(nextNum) && hashMap.get(nextNum) == false){
                currentLength ++;
                hashMap.put(nextNum, true);
                nextNum ++;
            }

            int prevNum = nums[i] - 1;
            while (hashMap.containsKey(prevNum) && hashMap.get(prevNum) == false){
                currentLength ++;
                hashMap.put(prevNum, true);
                prevNum --;
            }

            longestLength = Math.max(longestLength, currentLength);
        }
        return longestLength;
    }
}