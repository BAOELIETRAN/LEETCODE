import java.util.ArrayList;
import java.util.List;

class prob228 {
    public List<String> summaryRanges(int[] nums) {
        int index = 0;
        int count = 0;
        List<String> list = new ArrayList<>();
        if (nums.length == 0){
            return list;
        }
        if (nums.length == 1){
            list.add(String.valueOf(nums[0]));
            return list;
        }
        for (int i = 1; i < nums.length; i ++){
            if (nums[i] - 1 != nums[i - 1]){
                String str = "";
                if (count == 0){
                    str += String.valueOf(nums[i - 1]);
                    list.add(str);
                }
                else{
                    str += String.valueOf(nums[index]);
                    str += "->";
                    str += String.valueOf(nums[i - 1]);
                    list.add(str);
                }
                index = i;
                count = 0;
            }
            else{
                count ++;
            }
        }
        if (nums[index] != nums[nums.length - 1]){
            String str = "";
            str += String.valueOf(nums[index]);
            str += "->";
            str += String.valueOf(nums[nums.length - 1]);
            list.add(str);
        }
        else{
            list.add(String.valueOf(nums[index]));
        }
        return list;
    }
}