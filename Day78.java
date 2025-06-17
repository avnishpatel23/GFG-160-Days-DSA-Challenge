// Solve the Sudoku


class Solution {
    // Function to find a solved Sudoku.
    static void solveSudoku(int[][] mat) {
        solve (mat);
    }
    static boolean solve (int[][] board){
        for(int row = 0; row<9; row++){
            for(int col = 0; col<9; col++){
                if(board[row][col]==0){
                    for(int num =1; num<=9; num++){
                        if(isValid(board, row, col, num)){
                            board[row][col] = num;
                            if(solve(board)) return true;
                            board[row][col]=0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isValid(int[][] board, int row, int col, int num){
        for(int i=0; i<9; i++){
            if(board[row][i] == num) return false;
            if(board[i][col] == num) return false;
            if(board[3*(row/3)+i/3][3*(col/3)+i%3] == num) return false;
        }
        return true;
    }
}