public class Solution {
    /*
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        long lowerBound = 1;
        long upperBound = x;
        while (lowerBound + 1 < upperBound) {
            long mid = lowerBound + (upperBound - lowerBound) / 2;
            if (mid * mid == x){
                return (int)mid;
            }
            if (mid * mid < x) {
                lowerBound = mid;
            } else {
                upperBound = mid;
            }
        }
        
        if (upperBound * upperBound <= x) {
            return (int)upperBound;
        } else {
            return (int)lowerBound;
        }
    }
}