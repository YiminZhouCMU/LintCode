public class Solution {
    /*
     * @param board: the board
     * @return: whether the Sudoku is valid
     */
    public boolean isValidSudoku(char[][] board) {
        boolean[] visited = new boolean[9];
        
        //valid rows
        for (int i = 0; i < 9; i++) {
            Arrays.fill(visited, false);
            for (int j = 0; j < 9; j++) {
                if (!isValid(visited, board[i][j])) {
                    return false;
                }
            }
        }
        
        //valid columns
        for (int i = 0; i < 9; i++) {
            Arrays.fill(visited, false);
            for (int j = 0; j < 9; j++) {
                if (!isValid(visited, board[j][i])) {
                    return false;
                }
            }
        }
        
        //valid little sudoku
        for (int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 9; j = j + 3) {
                Arrays.fill(visited, false);
                for (int k = 0; k < 9; k++) {
                    if (!isValid(visited, board[i + k/3][j + k%3])) {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
    
    
    private boolean isValid(boolean[] visited, char p) {
        if (p == '.') {
            return true;
        }
        
        int num = p - '0';
        if ((num < 1) || (num > 9) || (visited[num - 1] == true)) {
            return false;
        }
        
        visited[num - 1] = true;
        return true;
    }
}