public class Solution {
    /*
     * @param num: a non-negative integer
     * @return: one digit
     */
    public int addDigits(int num) {
        // write your code here
        int result = recurAdd(num);
        while (result >= 10) {
            result = recurAdd(result);
        }
        return result;
    }
    public int recurAdd(int num) {
        int result = 0;
        while (num != 0) {
            result = result + (num % 10);
            num = num / 10;
        }
        return result;
    }
}