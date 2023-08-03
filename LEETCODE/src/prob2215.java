import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class prob2215 {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();
        for (int num : nums1){
            hashSet1.add(num);
        }
        for (int num : nums2){
            hashSet2.add(num);
        }
        HashSet<Integer> res1 = new HashSet<>();
        HashSet<Integer> res2 = new HashSet<>();
        for (int val : nums1){
            if (!hashSet2.contains(val)){
                res1.add(val);
            }
        }

        for (int val : nums2){
            if (!hashSet1.contains(val)){
                res2.add(val);
            }
        }

        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(res1));
        list.add(new ArrayList<>(res2));
        return list;
    }
}