class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int maxSoFar = ans, minSoFar = ans;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            maxSoFar = Math.max(maxSoFar*nums[i],nums[i]);
            minSoFar = Math.min(minSoFar*nums[i],nums[i]);

            ans = Math.max(maxSoFar,ans);
        }
        return ans;
    }
}

// class prob152 {
//     public int maxProduct(int[] nums) {
//         if (nums.length == 0){
//             return nums[0];
//         }
//         int res = nums[0];
//         int max = 1;
//         int min = 1;
//         for (int i = 0; i < nums.length; i ++){
//             int temp = max*nums[i];
//             max = Math.max(temp, Math.max(min * nums[i], nums[i]));
//             min = Math.min(temp, Math.min(min * nums[i], nums[i]));
//             res = Math.max(max, res);
//         }
//         return res;
//     }
// }
