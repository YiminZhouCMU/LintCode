public class Solution {
    /*
     * @param heights: a vector of integers
     * @return: an integer
     */
    public int maxArea(int[] heights) {
        if ((heights == null) || (heights.length == 0)) {
            return 0;
        }
        int left = 0;
        int right = heights.length - 1;
        int max = 0;
        while (left < right) {
            max = Math.max(max,(Math.min(heights[left], heights[right]) * (right - left)));
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}