class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        set<vector<int>> ans;
        sort(nums.begin(), nums.end());
        for (int i = 0; i < nums.size(); i ++){
            for (int j = i + 1; j < nums.size(); j ++){
                long value = (long)target - (long)nums[i] - (long)nums[j];
                int left = j + 1;
                int right = nums.size() - 1;
                while (left < right){
                    int sum = nums[left] + nums[right];
                    if (sum > value){
                        right --;
                    }
                    else if (sum < value){
                        left ++;
                    }
                    else{
                        vector<int> res;
                        res.push_back(nums[i]);
                        res.push_back(nums[j]);
                        res.push_back(nums[left]);
                        res.push_back(nums[right]);
                        ans.insert(res);
                        left ++;
                        right --;
                    }
                }
            }
        }
        vector<vector<int>> finale;
        for (vector<int> i : ans){
            finale.push_back(i);
        }
        return finale;
    }
};