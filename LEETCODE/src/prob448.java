import java.util.ArrayList;
import java.util.List;

class prob448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int []gaylord = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i ++){
            gaylord[nums[i]] += 1;
        }
        for (int i = 1; i <= n; i ++){
            if (gaylord[i] == 0){
                list.add(i);
            }
        }
        return list;
    }
}