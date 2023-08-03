// import java.util.ArrayList;
// import java.util.HashMap;

// class TimeMap {

//     HashMap<String, List<Pair<String, Integer>>> hashMap;

//     public TimeMap() {
//         hashMap = new HashMap<>();
//     }

//     public void set(String key, String value, int timestamp) {
//         if (!hashMap.containsKey(key)){
//             hashMap.put(key, new ArrayList<>());
//         }
//         hashMap.get(key).add(new Pair(value, timestamp));
//     }

//     public String get(String key, int timestamp) {
//         if (!hashMap.containsKey(key)){
//             return "";
//         }
//         return search(hashMap.get(key), timestamp);
//     }

//     private String search(List<Pair<String, Integer>> list, int timestamp){
//         int start = 0;
//         int end = list.size() - 1;
//         while (start < end) {
//             int mid = start + (end - start + 1) / 2;
//             if (list.get(mid).getValue() <= timestamp) start = mid; else end =
//                 mid - 1;
//         }
//         return list.get(start).getValue() <= timestamp
//             ? list.get(start).getKey()
//             : "";
//     }
// }
