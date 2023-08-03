class prob11 {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right){
            int container = right - left;
            int area = container * Math.min(height[left], height[right]);
            maxArea = Math.max(area, maxArea);
            if (height[left] < height[right]){
                left ++;
            }
            else{
                right --;
            }
        }
        return maxArea;
    }
}