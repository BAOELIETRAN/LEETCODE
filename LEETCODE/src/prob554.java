import java.util.List;
import java.util.HashMap;
class prob554 {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int maxGap = 0;
        int count = 0;
        for (List<Integer> list : wall){
            int prefix_sum = 0;
            for (int i = 0; i < list.size() - 1; i ++){
                prefix_sum += list.get(i);
                hashMap.put(prefix_sum, hashMap.getOrDefault(prefix_sum, 0) + 1);
            }
            count ++;
        }
        for (int key : hashMap.keySet()){
            maxGap = Math.max(maxGap, hashMap.get(key));
        }
        return count - maxGap;
    }
}