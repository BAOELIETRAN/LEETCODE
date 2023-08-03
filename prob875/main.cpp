class Solution {
public:
    int search(vector<int>& nums, int target) {
        int left = 0;
        int right = nums.size() - 1;
        while (left <= right){
            int mid = (left + right)/2;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid] >= nums[left]){
                if (target >= nums[left] && nums[mid] >= target){
                    right = mid -1;
                }
                else{
                    left = mid + 1;
                }
            }
            else{
                if (nums[right] >= target && target >= nums[mid]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
};
