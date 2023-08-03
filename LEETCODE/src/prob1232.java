class prob1232 {
    public static boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2){
            return true;
        }
        int[]arr1 = coordinates[0];
        int[]arr2 = coordinates[1];
        int[]vector = {arr2[0] - arr1[0], arr2[1] - arr1[1]};
        for (int i = 2; i < coordinates.length; i ++){
            int []this_vector = {coordinates[i][0] - arr1[0], coordinates[i][1] - arr1[1]};
            if (vector[0] == 0 && this_vector[0] != 0 || vector[0] != 0 && this_vector[0] == 0){
                return false;
            }
            if (vector[1] == 0 && this_vector[1] != 0 || vector[1] != 0 && this_vector[1] == 0){
                return false;
            }
            if (vector[0] != 0 && this_vector[0] != 0 && vector[1] != 0 && this_vector[1] != 0){
                if (this_vector[0]/vector[0] != this_vector[1]/vector[1]){
                    return false;
                }
            }
            
        }
        return true;
    }
}
