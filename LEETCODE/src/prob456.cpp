class Solution {
public:
    bool find132pattern(vector<int>& nums) {
       stack<int> res;
       int min_array[200000];
       min_array[0] = nums[0];
       for (int i = 1; i < nums.size(); i ++){
          min_array[i] = min(nums[i], min_array[i - 1]);
       }
       for (int i = nums.size() - 1; i >= 0; i --){
          if (i > 0 && min_array[i] >= nums[i]){
             continue;
          }
          while (!res.empty() && res.top() <= min_array[i]){
             res.pop();
          }
          if (!res.empty() && res.top() < nums[i]){
             return true;
          }
          res.push(nums[i]);
       }
       return false;
    }
};
