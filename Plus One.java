public class Solution {
    /*
     * @param digits: a number represented as an array of digits
     * @return: the result
     */
    public int[] plusOne(int[] digits) {
        if ((digits == null) || (digits.length == 0)) {
            return new int[0];
        }
        int carrier = 0;
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = digits[i] + carrier;
            carrier = 0;
            if (digits[i] > 9) {
                digits[i] = digits[i] % 10;
                carrier = 1;
            }
            if (carrier == 0){
                break;
            }
        }
        if (carrier > 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = carrier;
            for (int j = 0; j < digits.length; j++) {
                newDigits[j + 1] = digits[j];
            }
            return newDigits;
        }
        return digits;
    }
}