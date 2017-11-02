/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */


public class Solution {
    /*
     * @param points: an array of point
     * @return: An integer
     */
    public int maxPoints(Point[] points) {
        if ((points == null) || (points.length == 0)) {
            return 0;
        }
        
        Map<Double, Integer> map = new HashMap<Double, Integer>();
        int max = 1;
        for (int i = 0; i < points.length; i++) {
            map.clear();
            
            map.put((double)Integer.MIN_VALUE, 1);
            int dup = 0;
            for (int j = i + 1; j < points.length; j++) {
                
                if ((points[j].x == points[i].x) && (points[j].y == points[i].y)) {
                    dup = dup + 1;
                    continue;
                }
                
                double key = 0.0;
                if (points[j].x == points[i].x) {
                    key = (double)Integer.MAX_VALUE;
                } else {
                    key = 0.0 + (double)(points[j].y - points[i].y)/(points[j].x - points[i].x);
                }
                
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + 1);
                } else {
                    map.put(key, 2);
                }
            }
            for (int temp : map.values()) {
                if (temp + dup > max) {
                    max = temp + dup;
                }
            }
        }
        return max;
    }
}