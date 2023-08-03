class prob74 {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int rows = matrix.size();
        int cols = matrix[0].size();
        int left = 0;
        int right = rows - 1;
        int ans = 0;
        while (left <= right){
            int mid = (left + right)/2;
            if (matrix[mid][0] <= target){
                left = mid + 1;
                ans = mid;
            }
            else{
                right = mid - 1;
            }
        }
        int new_left = 0;
        int new_right = cols - 1;
        int res = 0;
        while (new_left <= new_right){
            int mid = (new_right + new_left)/2;
            if (matrix[ans][mid] <= target){
                new_left = mid + 1;
                res = mid;
            }
            else{
                new_right = mid - 1;
            }
        }
        if (matrix[ans][res] == target){
            return true;
        }
        return false;
    }
};