import java.util.ArrayList;
import java.util.List;

class prob46 {
    int []arr = new int[100];
    boolean []isGood = new boolean[100];
    List<List<Integer>> list = new ArrayList<>();
    private void backtrack(int i, int[]nums){
        int n = nums.length;
        for (int num : nums){
            if (num < 0){
                num += 100;
            }
            if (isGood[num] == false){
                arr[i] = num;
                isGood[num] = true;
                if (i == n - 1){
                    List<Integer> value = new ArrayList<>();
                    for (int index = 0; index < n; index ++){
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
                isGood[num] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        backtrack(0, nums);
        return list;
    }
}