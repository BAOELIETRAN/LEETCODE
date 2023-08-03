// code gọn hơn:
// class Solution {
//     public boolean canPlaceFlowers(int[] flowerbed, int n) {
//         int size = flowerbed.length;
//         if(n==0) return true;
//         for(int i=0; i<size; i++){
//             if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i==size-1 || flowerbed[i+1]==0)){
//                 n--;
//                 if(n==0) return true;
//                 flowerbed[i]=1;
//             }
//         }
//         return false;
//     }
// }

class prob605 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        if (flowerbed.length == 1){
            if(flowerbed[0] == 1){
                if (n == 0){
                    return true;
                }
                return false;
            }
            if (flowerbed[0] == 0){
                if (n <= 1){
                    return true;
                }
                return false;
            }
            if (n == 1){
                return true;
            }
            return false;
        }
        for (int i = 0; i < flowerbed.length; i ++){
            if (flowerbed[i] == 1){
                continue;
            }
            if (i == 0){
                if (flowerbed[i + 1] == 0){
                    flowerbed[i] = 1;
                    count++;
                }
            }
            else if (i == flowerbed.length - 1){
                if (flowerbed[i - 1] == 0){
                    flowerbed[i] = 1;
                    count++;
                }
            }
            else{
                if (flowerbed[i - 1] == 0 && flowerbed[i + 1]== 0){
                    flowerbed[i] = 1;
                    count ++;
                }
                else{
                    continue;
                }
            }
        }
        if (count >= n){
            return true;
        }
        return false;
    }
}