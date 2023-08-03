class prob1491 {
    public static double average(int[] salary) {
        int max = salary[0];
        for (int num : salary){
            max = Math.max(max, num);
        }
        int min = salary[0];
        for (int num : salary){
            min = Math.min(min, num);
        }
        int sum = 0;
        for (int i = 0; i < salary.length; i ++){
            sum += salary[i];
        }
        sum -= min;
        sum -= max;
        return (double)sum/(salary.length - 2);
    }
}