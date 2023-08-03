class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int left = 1;
        int right = 0;
        for (int i = 0; i < piles.size(); i ++){
            right = std::max(piles[i], right);
        }
        while (left < right){
            int mid = (left + right)/2;
            long long sum = 0;
            for (int i = 0; i < piles.size(); i ++){
                long long k = (piles[i] -1)/mid + 1;
                sum += k;
            }
            if (sum <= h){
                right = mid;
            }
            if (sum > h){
                left = mid + 1;
            }
        }
        return left;
    }
};
