public class Solution {
    /*
     * @param x: the base number
     * @param n: the power number
     * @return: the result
     */
    public double myPow(double x, long n) {
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        
        double ans = 1;
        double tmp = x;
        while (n != 0) {
            if (n % 2 == 1){
                ans = ans * tmp;
            }
            tmp = tmp * tmp;
            n = n / 2;
        }
        return ans;
    }
}