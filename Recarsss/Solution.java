import java.util.ArrayList;
import java.util.List;

public class Solution {

    public boolean isSafe(int row, int col, char[][] board) {
        int n = board.length;

        // horizontal
        for (int j = 0; j < n; j++) {
            if (board[row][j] == 'Q') return false;
        }

        // vertical
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // upper left
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') return false;
        }

        // upper right
        for (int r = row, c = col; r >= 0 && c < n; r--, c++) {
            if (board[r][c] == 'Q') return false;
        }

        // lower left
        for (int r = row, c = col; r < n && c >= 0; r++, c--) {
            if (board[r][c] == 'Q') return false;
        }

        // lower right
        for (int r = row, c = col; r < n && c < n; r++, c++) {
            if (board[r][c] == 'Q') return false;
        }

        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < board[0].length; j++) {
                row.append(board[i][j]);
            }
            newBoard.add(row.toString());
        }

        allBoards.add(newBoard);
    }

    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.'; // backtrack
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        // ✅ Initialize board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        List<List<String>> res = s.solveNQueens(4);

        if (res.isEmpty()) {
            System.out.println("No solutions found!");
        } else {
            System.out.println("Total solutions: " + res.size());
            for (List<String> board : res) {
                for (String row : board) {
                    System.out.println(row);
                }
                System.out.println();
            }
        }
    }
}
