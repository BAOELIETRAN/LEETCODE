import java.util.Scanner;
import java.util.HashMap;
public class prob1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []gaylord = new int[n];
        for (int i = 0; i < n; i ++){
            gaylord[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int target = sc.nextInt();
        for (int i = 0; i < n; i ++){
            int result = target - gaylord[i];
            if (hashMap.containsKey(result)){
                System.out.println(hashMap.get(result) + i);
                break;
            }
            else{
                hashMap.put(gaylord[i], i);
            }
        }
        sc.close();
    }
}