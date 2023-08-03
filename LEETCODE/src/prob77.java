import java.util.ArrayList;
import java.util.List;


class prob77 {
    int[]arr = new int[100];
    boolean[]isGood = new boolean[100];
    List<List<Integer>> list = new ArrayList<>();
    private void backtrack(int i, int n, int k){
        for (int num = arr[i - 1] + 1; num <= n; num ++){
            if (isGood[num] == false){
                arr[i] = num;
                isGood[num] = true;
                if (i == k){
                    List<Integer> value = new ArrayList<>();
                    for (int index = 1; index <= k; index ++){
                        value.add(arr[index]);
                    }
                    list.add(value);
                }
                else{
                    backtrack(i + 1, n, k);
                }
                isGood[num] = false;
            }
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        backtrack(1, n, k);
        return list;
    }
}