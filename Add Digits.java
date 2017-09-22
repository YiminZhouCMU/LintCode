public class Solution {
    /*
     * @param num: a non-negative integer
     * @return: one digit
     */
    public int addDigits(int num) {
        // write your code here
        int result = num;
        if (result > 9) {
            result = (result - 1) % 9 + 1;
        }
        return result;
    }
}