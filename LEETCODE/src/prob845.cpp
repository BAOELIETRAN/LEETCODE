class Solution {
public:
    int longestMountain(vector<int>& arr) {
        int res = 0;
        int i = 0;
        while (i < arr.size()){
            int j = i;
            if (j + 1 < arr.size() && arr[j] < arr[j + 1]){
                while (j + 1 < arr.size() && arr[j] < arr[j + 1]){
                    j ++;
                }
                if (j + 1 < arr.size() && arr[j] > arr[j + 1]){
                    while (j + 1 < arr.size() && arr[j] > arr[j + 1]){
                        j ++;
                    }
                    res = max(j - i + 1, res);
                }
            }
            i = max(i + 1, j);
        }
        return res;
    }
};
