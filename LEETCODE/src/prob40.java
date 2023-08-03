import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class prob40 {
    List<List<Integer>> list = new ArrayList();
    int[]arr = new int[100];
    int count = 0;
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    private void backtrack(int i, int target, int[]candidates){
        for (int key : hashMap.keySet()){
            if (hashMap.get(key) != 0){
                if (key >= arr[i - 1] && key <= target && target > 0){
                    target -= key;
                    arr[i] = key;
                    count ++;
                    hashMap.put(key, hashMap.get(key) - 1);
                    if (target == 0){
                        List<Integer> value = new ArrayList<>();
                        for (int index = 1; index <= count; index ++){
                            value.add(arr[index]);
                        }
                        list.add(value);
                    }
                    else{
                        backtrack(i + 1, target, candidates);
                    }
                    count --;
                    target += key;
                    hashMap.put(key, hashMap.get(key) + 1);
                }
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        for (int num : candidates){
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        backtrack(1, target, candidates);
        return list;
    }
}