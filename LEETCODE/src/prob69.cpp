class Solution {
public:
    int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        if (x <= 3 && x != 0){
            return 1;
        }
        long long left = 0;
        long long right = (x/2);
        while (left < right){
            long long mid = ((left+right)/2);
            long long target = (mid*mid);
            if (target < (long long)x){
                left = (mid + 1);
            }
            else{
                right = mid;
            }
        }
        if (left*left == (long long)x || left*left < (long long)x){
            return left;
        }
        else{
            return left - 1;
        }
    }
};