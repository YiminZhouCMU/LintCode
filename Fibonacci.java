public class Solution {
    /*
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        if (n == 1){
            return 0;
        } else if (n == 2){
            return 1;
        } else {
            int result = fibonacci(n - 1) + fibonacci(n - 2);
            return result;
        }
    }
}