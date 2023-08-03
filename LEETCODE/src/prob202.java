import java.util.HashSet;

class prob202 {
    public boolean isHappy(int n) {
        if (n == 1 || n == -1){
            return true;
        }
        HashSet<Integer> visit = new HashSet<>();
        while (!visit.contains(n)){
            visit.add(n);
            n = sumSquare(n);
            if (n == 1){
                return true;
            }
        }
        return false;
    }
    private int sumSquare(int n){
        int value = 0;
        while (n != 0){
            int digit = n % 10;
            value += digit*digit;
            n /= 10;
        }
        return value;
    }
}