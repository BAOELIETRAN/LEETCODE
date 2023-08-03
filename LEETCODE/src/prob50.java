class prob50 {
    public double myPow(double x, int n) {
        if (n == 0){
            return 1;
        }
        if (n < 0){
            if (n % 2 == 0){
                n = n/2;
                n = -n;
                x = (1/x)*(1/x);
            }
            else{
                n = -n;
                x = 1/x;
            }
        }
        if (n % 2 == 0){
            return myPow(x*x, n/2);
        }
        else{
            return x*myPow(x*x, n/2);
        }
    }
}