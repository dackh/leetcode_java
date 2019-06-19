/*
 * @lc app=leetcode id=37 lang=java
 *
 * [37] Sudoku Solver
 */
class Solution {
    public void solveSudoku(char[][] board) {
        helper(board,0,0);
    }

    public boolean helper(char[][] board,int row,int col) {
        if(col == board[0].length){
            row++;
            col = 0;
        }
        if(row == board.length){
            return true;
        }
        if(board[row][col] != '.'){
            return helper(board,row,col+1);
        }

        for(char ch = '1';ch<='9';ch++){
            if(invalid(board,row,col,ch)){
                continue;
            }
            board[row][col] = ch;
            if(helper(board, row, col+1)){
                return true;
            }
            board[row][col] = '.';
        }

        return false;
    }

    public boolean invalid(char[][] board,int row,int col,char ch){
        for(int i = 0;i<9;i++){
            if(board[row][i] == ch || board[i][col] == ch || board[row/3*3+i/3][col/3*3+i%3] == ch){
                return true;
            }
        }
        return false;
    }
}

