import java.util.Arrays;
import java.util.Comparator;

class prob179 {
    public static String largestNumber(int[] nums) {
        String[]arr = new String[nums.length];
        for (int i = 0; i < nums.length; i ++){
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                // TODO Auto-generated method stub
                String t1 = o1 + o2;
                String t2 = o2 + o1;
                return (t2.compareTo(t1));
            }
            
        });

        if (arr[0].equals("0")){
            return "0";
        }

        String string = "";
        for (int i = 0; i < arr.length; i ++){
            string += arr[i];
        }
        return string;
    }

    public static void main(String[]args){
        int[]nums = {3,30,34,5,9};
        System.out.println(largestNumber(nums));
    }
}