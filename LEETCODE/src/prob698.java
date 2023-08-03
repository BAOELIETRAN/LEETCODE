import java.util.ArrayList;
import java.util.List;

class prob698 {
    List<List<Integer>> list = new ArrayList<>();
    boolean[]isGood = new boolean[100];
    private boolean backtrack(int i, int cursum, int target, int k, int []nums){
        if (k == 1){
            return true;
        }
        if (cursum == target){
            k --;
            return backtrack(0, 0, target, k, nums);
        }
        if (cursum > target){
            return false;
        }
        for (int index = i; index < nums.length; index ++){
            if (isGood[index] == false){
                if (nums[index] + cursum <= target){
                    isGood[index] = true;
                    boolean newstate = backtrack(index + 1, cursum + nums[index], target, k, nums);
                    if (newstate == true){
                        return true;
                    }
                    isGood[index] = false;
                }
            }
        }
        return false;
    }     

    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int num : nums){
            sum += num;
        }
        if (sum % k == 0){
            return backtrack(0, 0, sum/k, k, nums);
        }
        return false;
    }
}