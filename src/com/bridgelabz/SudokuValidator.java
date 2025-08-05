package com.bridgelabz;

public class SudokuValidator {
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        boolean isValid = isValidSudoku(board);
        System.out.println("Valid Sudoku? " + isValid);
    }

    static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] row = new boolean[9];
            boolean[] col = new boolean[9];
            boolean[] box = new boolean[9];

            for (int j = 0; j < 9; j++) {
                // Row
                if (board[i][j] != '.') {
                    int val = board[i][j] - '1';
                    if (row[val]) return false;
                    row[val] = true;
                }
                // Column
                if (board[j][i] != '.') {
                    int val = board[j][i] - '1';
                    if (col[val]) return false;
                    col[val] = true;
                }
                // Box
                int r = 3 * (i / 3) + j / 3;
                int c = 3 * (i % 3) + j % 3;
                if (board[r][c] != '.') {
                    int val = board[r][c] - '1';
                    if (box[val]) return false;
                    box[val] = true;
                }
            }
        }
        return true;
    }
}
