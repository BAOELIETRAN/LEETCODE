class prob238 {
    public static int[] productExceptSelf(int[] nums) {
        int []arr1 = new int[nums.length];
        int []arr2 = new int[nums.length];
        int product = 1;
        for (int i = 0; i < arr1.length; i ++){
            arr1[i] = product;
            product *= nums[i];
        }
        product = 1;
        for (int i = arr2.length - 1; i >= 0; i --){
            arr2[i] = product;
            product *= nums[i];
        }
        int[]arr = new int[nums.length];
        for (int i = 0; i < arr.length; i ++){
            arr[i] = arr1[i]*arr2[i];
        }
        return arr;
    }
}

// CÁCH LÀM PREFIX SUM:
// class Solution {
//     public static int[] productExceptSelf(int[] nums) {
//         int[]arr1 = new int[nums.length];
//         arr1[0] = 1;
//         for (int i = 1; i < arr1.length; i ++){
//             arr1[i] = arr1[i-1] * nums[i-1];
//         }
//         int[]arr2 = new int[nums.length];
//         arr2[nums.length - 1] = 1;
//         for (int i = arr2.length - 2; i >= 0; i --){
//             arr2[i] = arr2[i + 1] * nums[i + 1];
//         }
//         int[]arr3 = new int[nums.length];
//         for (int i = 0; i < arr3.length; i ++){
//             arr3[i] = arr1[i] * arr2[i];
//         }
//         return arr3;
//     }
// }