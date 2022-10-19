package sudokusolver;

import java.util.Arrays;

public class SudokuSolver {

    private static final int GRID_SIZE = 9;
    public static void main(String[] args) {

        int[][] board = {
                {7,0,2,0,5,0,6,0,0},
                {0,0,0,0,0,3,0,0,0},
                {1,0,0,0,0,9,5,0,0},
                {8,0,0,0,0,0,0,9,0},
                {0,4,3,0,0,0,7,5,0},
                {0,9,0,0,0,0,0,0,8},
                {0,0,9,7,0,0,0,0,5},
                {0,0,0,2,0,0,0,0,0},
                {0,0,7,0,4,0,2,0,3}
        };

        if(solveBoard(board)){
            System.out.println("Solved Successfully");
            printBoard(board);
        }else {
            System.out.println("Unsolvable board");
        }


    }

    private static void printBoard(int[][] board) {
        for(int i=0;i<GRID_SIZE;i++){
            for(int j=0;j<GRID_SIZE;j++){
                System.out.print(board[i][j]+"  ");
            }
            System.out.println();
        }
    }

    private static boolean isNumberInRow(int[][] board,int n,int row){
        for(int i=0;i<GRID_SIZE;i++){
            if(board[row][i]==n) return true;
        }
        return false;
    }

    private static boolean isNumberInColumn(int[][] board,int n,int column){
        for(int i=0;i<GRID_SIZE;i++){
            if(board[i][column]==n) return true;
        }
        return false;
    }

    private static boolean isNumberInBox(int[][] board,int n,int row,int column){
        int localBoxRow = row - row % 3;
        int localBoxColumn = column - column % 3;

        for(int i=localBoxRow;i<localBoxRow;i++){
            for(int j=localBoxColumn;j<localBoxColumn;j++) {
                if (board[i][j] == n) return true;
            }
        }
        return false;
    }

    private static boolean isValidPosition(int[][] board,int n,int row,int column){
        return !isNumberInRow(board,n,row) &&
                !isNumberInColumn(board,n,column) &&
                !isNumberInBox(board,n,row,column);
    }

    private static boolean solveBoard(int[][] board){
        for(int row=0;row<GRID_SIZE;row++){
            for(int column=0;column<GRID_SIZE;column++){
                if(board[row][column]==0){
                    for(int guess=1;guess<=GRID_SIZE;guess++){
                        if(isValidPosition(board,guess,row,column)){
                            board[row][column]=guess;

                            if(solveBoard(board)){
                                return true;
                            }else {
                                board[row][column] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

}
