class prob9 {
    public boolean isPalindrome(int x) {
        int origin = x;
        if (x >= 0){
            int value = 0;
            while (x != 0){
                value = value*10 + x%10;
                x /= 10;
            }
            if (value == origin){
                return true;
            }
        }
        return false;
    }
}