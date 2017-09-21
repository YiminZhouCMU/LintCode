public class Solution {
    /*
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        int first = 0;
        int second = 1;
        for (int i = 0; i < n - 1; i++){
            int next = first + second;
            first = second;
            second = next;
        }
        return first;
    }
}