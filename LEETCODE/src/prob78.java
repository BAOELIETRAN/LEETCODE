import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class prob78 {
    int[]arr = new int[100];
    boolean[]isGood = new boolean[100];
    List<List<Integer>> list = new ArrayList<>();
    public prob78() {
        Arrays.fill(arr, -20);
    }
    private void backtrack(int i, int k, int[]nums){
        for (int num : nums){
            if (num < 0){
                num += 100;
            }
            if (num > arr[i - 1]){
                if (isGood[num] == false){
                    arr[i] = num;
                    isGood[num] = true;
                    if (i == k){
                        List<Integer> value = new ArrayList<>();
                        for (int index = 1; index <= k; index ++){
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
                        backtrack(i + 1, k, nums);
                    }
                    isGood[num] = false;
                }
            }
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        list.add(new ArrayList<>());
        for (int i = 0; i <= nums.length; i ++){
            backtrack(1, i, nums);
        }
        return list;
    }
}