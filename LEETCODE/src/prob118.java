import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class prob118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list_array = new ArrayList<>();
        for (int i = 1; i <= numRows; i ++){
            Integer []arr = new Integer[i];
            arr[0] = 1;
            arr[i - 1] = 1;
            for (int j = 1; j <= i - 2; j ++){
                arr[j] = list_array.get(i - 2).get(j - 1) + list_array.get(i - 2).get(j);
            }
            List<Integer> list2 = Arrays.asList(arr);
            list_array.add(list2);
        }
        return list_array;
    }
}