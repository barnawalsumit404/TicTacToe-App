import java.util.Random;
public class TicTacToeUC7 {
    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };
    static char computerSymbol = 'O';
    public static void main(String[] args) {
        computerMove();
    }
    static void computerMove() {
        Random random = new Random();
        int slot;
        int row;
        int col;
        do {
            slot = random.nextInt(9) + 1;
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;
        } while (!isValidMove(row, col));
        board[row][col] = computerSymbol;
    }
    static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }
}