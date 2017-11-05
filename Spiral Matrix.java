class Direction {
    public static int DOWN = 0;
    public static int RIGHT = 1;
    public static int LEFT = 2;
    public static int UP = 3;
    
    private static int[] dx = new int[]{1, 0, 0, -1};
    private static int[] dy = new int[]{0, 1, -1, 0};
    
    public static int turnRight(int direction) {
        if (direction == DOWN) {
            return LEFT;
        } else if (direction == RIGHT) {
            return DOWN;
        } else if (direction == LEFT) {
            return UP;
        } else if (direction == UP) {
            return RIGHT;
        }
        return -1;
    }
    
    public static int[] move(int[] cursor, int direction) {
        int[] nextCursor = new int[2];
        nextCursor[0] = cursor[0] + dx[direction];
        nextCursor[1] = cursor[1] + dy[direction];
        return nextCursor;
    }
}



public class Solution {
    /*
     * @param matrix: a matrix of m x n elements
     * @return: an integer list
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        
        if ((matrix == null) || (matrix.length == 0)) {
            return result;
        }
        int rowNum = matrix.length;
        
        if ((matrix[0] == null) || (matrix[0].length == 0)) {
            return result;
        }
        int colNum = matrix[0].length;
        
        int[] cursor = new int[]{0, 0};
        int direction = Direction.RIGHT;
        for (int i = 0; i < rowNum * colNum; i++) {
            result.add(matrix[cursor[0]][cursor[1]]);
            matrix[cursor[0]][cursor[1]] = -1;
            
            int[] nextCursor = Direction.move(cursor, direction);
            if ((nextCursor[0] >= rowNum) || (nextCursor[1] >= colNum) || (nextCursor[0] < 0) || (nextCursor[1] < 0) || (matrix[nextCursor[0]][nextCursor[1]] == -1)) {
                direction = Direction.turnRight(direction);
                nextCursor = Direction.move(cursor, direction);
            }
            
            cursor = nextCursor;
        }
        
        return result;
    }
}