package Question_9;

public class TicTacToeClass {
    private char[][] board;      // 2D array for the game board
    private int turns;           // Counter for the number of turns

    // Default Constructor
    public TicTacToeClass() {
        board = new char[3][3];
        turns = 0;

        // Initialize the board with blank spaces
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Accessor Methods

    // Checks if the specified player (p) has won
    public boolean isWinner(char p) {
        // Check rows, columns, and diagonals for a winning line of 'p'
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == p && board[i][1] == p && board[i][2] == p) return true; // Row
            if (board[0][i] == p && board[1][i] == p && board[2][i] == p) return true; // Column
        }
        if (board[0][0] == p && board[1][1] == p && board[2][2] == p) return true; // Diagonal
        if (board[0][2] == p && board[1][1] == p && board[2][0] == p) return true; // Opposite Diagonal
        return false;
    }

    // Checks if the board is full (9 turns played)
    public boolean isFull() {
        return turns == 9;
    }

    // Checks if the game is a "cat's game" (board full, no winner)
    public boolean isCat() {
        return isFull() && !isWinner('X') && !isWinner('O');
    }

    // Checks if the given row and column is a valid board position
    public boolean isValid(int r, int c) {
        return r >= 0 && r < 3 && c >= 0 && c < 3 && board[r][c] == ' ';
    }

    // Returns the number of turns played so far
    public int numTurns() {
        return turns;
    }

    // Returns the character at the specified row and column (either ' ', 'X', or 'O')
    public char playerAt(int r, int c) {
        if (r >= 0 && r < 3 && c >= 0 && c < 3) {
            return board[r][c];
        }
        return ' '; // Return a blank space if out of bounds
    }

    // Displays the current board on the screen
    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2] + " ");
            if (i < 2) System.out.println("---+---+---");
        }
    }

    // Modifier Methods

    // Allows player 'p' to play their move at row r, column c
    public void playMove(char p, int r, int c) {
        if (isValid(r, c)) {
            board[r][c] = p;
            turns++;
        } else {
            System.out.println("Invalid move. Try again.");
        }
    }
}

