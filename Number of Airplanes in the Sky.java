/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */

class Point implements Comparable<Point> {
    int time;
    int flag;
    public Point(int newTime, int landOrOff) {
        time = newTime;
        flag = landOrOff;
    }
    @Override
    public int compareTo(Point p) {
        if (time - p.time == 0) {
            return flag - p.flag;
        } else {
            return time - p.time;
        }
    }
}
public class Solution {
    /*
     * @param airplanes: An interval array
     * @return: Count of airplanes are in the sky.
     */
    public int countOfAirplanes(List<Interval> airplanes) {
        List<Point> points = new ArrayList<Point>(airplanes.size() * 2);
        for (Interval airplane : airplanes) {
            points.add(new Point(airplane.start, 1));
            points.add(new Point(airplane.end, 0));
        }
        Collections.sort(points);
        int result = 0;
        int max = 0;
        for (Point p : points) {
            if (p.flag == 1) {
                max = max + 1;
            } else {
                max = max - 1;
            }
            result = Math.max(result, max);
        }
        return result;
    }
}