public class Solution {
    /*
     * @param a: a number
     * @param b: a number
     * @return: the result
     */
    public String addBinary(String a, String b) {
        // write your code here
        int carry = 0;
        int num1;
        int num2;
        int sum;
        String biLong;
        String biShort;
        int inLong;
        int inShort;
        String result = "";
        if (a.length() < b.length()) {
            biLong = b;
            biShort = a;
            inLong = b.length() - 1;
            inShort = a.length() - 1;
        } else {
            biLong = a;
            biShort = b;
            inLong = a.length() - 1;
            inShort = b.length() - 1;
        }
        while (inShort >= 0) {
            num1 = biLong.charAt(inLong) - '0';
            num2 = biShort.charAt(inShort) - '0';
            sum = (num1 + num2) + carry;
            result = String.valueOf(sum % 2) + result;
            carry = sum / 2;
            inShort--;
            inLong--;
        }
        while (inLong >= 0) {
            num1 = biLong.charAt(inLong) - '0';
            num2 = 0;
            sum = (num1 + num2) + carry;
            result = String.valueOf(sum % 2) + result;
            carry = sum / 2;
            inLong--;
        }
        if (carry != 0) {
            result = String.valueOf(carry) + result;
        }
        return result;
    }
}