import java.util.Arrays;
import java.util.Stack;

class prob853 {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][]combination = new int[n][2];
        for (int i = 0; i < n; i ++){
            combination[i][0] = position[i];
            combination[i][1] = speed[i];
        }
        Arrays.sort(combination, (a,b) -> (a[0] == b[0])? a[1] - b[1] : a[0] - b[0]);
        Stack<Double> fleet = new Stack<>();
        for (int i = n - 1; i >= 0; i --){
            double currentTime = (double)(target - combination[i][0])/combination[i][1];
            if (!fleet.isEmpty() && currentTime <= fleet.peek()){
                continue;
            }
            else{
                fleet.push(currentTime);
            }
        }
        return fleet.size();
    }
}