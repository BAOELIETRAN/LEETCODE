import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class prob47 {
    List<List<Integer>> list = new ArrayList<>();
    int []arr = new int[100];
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    public prob47(){
        Arrays.fill(arr, -20);
    }
    private void backtrack(int i, int[]nums){
        int k = nums.length;
        for (int key : hashMap.keySet()){
            if (hashMap.get(key) != 0){
                arr[i] = key;
                hashMap.put(key, hashMap.get(key) - 1);
                if (i == k - 1){
                    List<Integer> value = new ArrayList<>();
                    for (int index = 0; index < k; index ++){
                        if (arr[index] > 10){
                            value.add(arr[index] - 100);
                        }
                        else{
                            value.add(arr[index]);
                        }
                    }
                    list.add(value);
                }
                else{
                    backtrack(i + 1, nums);
                }
                hashMap.put(key, hashMap.get(key) + 1);
            }
        }
    }
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        for (int num : nums){
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        backtrack(0, nums);
        return list;
    }
}