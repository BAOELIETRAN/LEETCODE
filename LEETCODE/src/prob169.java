class prob169 {
    public static int majorityElement(int[] nums) {
        int res = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                res = nums[i];
                count = 1;
            } else if (res == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        
        // Additional step to validate the majority element
        int majorityCount = 0;
        for (int num : nums) {
            if (num == res) {
                majorityCount++;
            }
        }
        
        if (majorityCount > nums.length / 2) {
            return res;
        }
        
        return -1; // No majority element found
    }
}





// Cách naive
// import java.util.HashMap;
// import java.util.Map;
// class prob169 {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer, Integer> hashMap = new HashMap<>();
//         for (int i = 0; i < nums.length; i ++){
//             int count = 1;
//             if (hashMap.containsKey(nums[i])){
//                 count = hashMap.get(nums[i]) + 1;
//             }
//             hashMap.put(nums[i], count);
//         }
//         for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
//             Integer num = entry.getValue();
//             if (num > nums.length/2){
//                 return entry.getKey();
//             }
//         }
//         return 0;
//     }
// }