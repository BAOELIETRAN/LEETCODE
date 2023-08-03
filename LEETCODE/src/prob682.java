class prob682 {
    public int calPoints(String[] operations) {
        int[]arr = new int[1000];
        int top = -1;
        int sum = 0;
        for (String num : operations){
            if (top >= 0 && num.equals("C")){
                arr[top] = 0;
                top --;
                continue;
            }
            else if (top >= 1 && num.equals("+")){
                int a = arr[top];
                int b = arr[top - 1];
                top ++;
                arr[top] = a + b;
            }
            else if (top >= 0&& num.equals("D")){
                int a = arr[top];
                top ++;
                arr[top] = a*2;
            }
            else{
                top++;
                arr[top] = Integer.parseInt(num);
            }
        }   
        for (int i : arr){
            sum += i;
        }    
        return sum;
    }
}