import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class prob90 {
    int[]arr = new int[100];
    List<List<Integer>> list = new ArrayList<>();
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    public prob90() {
        Arrays.fill(arr, -20);
    }
    private void backtrack(int i, int k, int[]nums){
        for (int key : hashMap.keySet()){
            if (key >= arr[i - 1] && hashMap.get(key) != 0){
                arr[i] = key;
                hashMap.put(key, hashMap.get(key) - 1);
                if (i == k){
                    List<Integer> value = new ArrayList<>();
                    for (int index = 1; index <= k; index ++){
                        value.add(arr[index]);
                    }
                    list.add(value);
                }
                else{
                    backtrack(i + 1, k, nums);
                }
                hashMap.put(key, hashMap.get(key) + 1);
            }
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums)  {
        Arrays.sort(nums);
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        list.add(new ArrayList<>());
        for (int i = 1; i <= nums.length; i ++){
            backtrack(1, i, nums);
        }
        return list;
    }
}