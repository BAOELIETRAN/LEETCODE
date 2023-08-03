import java.util.Arrays;

class prob735 {
    public static int[] asteroidCollision(int[] asteroids) {
        int top = -1;
        for (int num : asteroids){
            boolean isGood = true;
            while (isGood && num < 0 && asteroids[top] > 0 && top >= 0){
                isGood = num + asteroids[top] < 0;
                if (num + asteroids[top] <= 0){
                    top --;
                }
            }
            if (isGood){
                top ++;
                asteroids[top] = num;
            }
        }
        return Arrays.copyOf(asteroids, top + 1);
    }
}