import java.util.ArrayList;
import java.util.List;

class prob39 {
    List<List<Integer>> list = new ArrayList();
    int count = 0;
    int []arr = new int[100];
    private void backtrack(int i, int target, int[]candidates){
        int n = candidates.length;
        for (int index = 0; index < n; index ++){
            if (candidates[index] >= arr[i - 1] && candidates[index] <= target && target > 0){
                target -= candidates[index];
                arr[i] = candidates[index];
                count ++;
                if (target == 0){
                    List<Integer> value = new ArrayList<>();
                    for (int t = 1; t <= count; t ++){
                        value.add(arr[t]);
                    }
                    list.add(value);
                }
                else{
                    backtrack(i + 1, target, candidates);
                }
                count --;
                target += candidates[index];
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(1, target, candidates);
        return list;
    }
}