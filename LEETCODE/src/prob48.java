class prob48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        if (n > 1){
            //rotate chéo
            for (int i = 1; i < n; i ++){
                for (int j = 1; j <= i; j ++){
                    int temp = matrix[i - j][i];
                    matrix[i - j][i] = matrix[i][i - j];
                    matrix[i][i - j] = temp;
                }
            }
            //flip 180 do
            for (int row = 0; row < n; row ++){
                int left = 0;
                int right = n - 1;
                while (left < right){
                    int temp = matrix[row][left];
                    matrix[row][left] = matrix[row][right];
                    matrix[row][right] = temp;
                    left ++;
                    right --;
                }
            }
        }
    }
}