class prob66 {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;
        int carry = digits[digits.length - 1] / 10;
        digits[digits.length - 1] = digits[digits.length - 1] % 10;

        for (int i = digits.length - 2; i >= 0; i--) {
            digits[i] += carry;
            carry = digits[i] / 10;
            digits[i] = digits[i] % 10;
        }

        if (carry > 0) {
            int[] arr = new int[digits.length + 1];
            arr[0] = carry;
            for (int i = 0; i < digits.length; i++) {
                arr[i + 1] = digits[i];
            }
            return arr;
        }

        return digits;
    }
}
