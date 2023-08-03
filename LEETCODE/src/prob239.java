import java.util.Deque;
import java.util.LinkedList;

class prob239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[]ans = new int[n - k + 1];
        int left = 0;
        Deque<Integer> index = new LinkedList<>();
        for (int i = 0; i < n; i ++){
            if(!index.isEmpty() && index.peekFirst() < i - k + 1){
                index.pollFirst();
            }
            while (!index.isEmpty() && nums[i] > nums[index.peekLast()]){
                index.pollLast();
            }
            index.offer(i);
            if (i >= k - 1){
                ans[left] = nums[index.peekFirst()];
                left ++;
            }
        }
        return ans;
    }
}