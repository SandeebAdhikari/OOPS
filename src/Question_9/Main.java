package Question_9;

public class Main {
    public static void main(String[] args) {
        TicTacToeClass game = new TicTacToeClass();
        game.displayBoard();

        // Sample moves
        game.playMove('X', 0, 0);
        game.displayBoard();

        game.playMove('O', 1, 1);
        game.displayBoard();

        game.playMove('X', 0, 1);
        game.displayBoard();

        game.playMove('O', 2, 2);
        game.displayBoard();

        game.playMove('X', 0, 2); // X wins with this move
        game.displayBoard();

        // Check if X is the winner
        if (game.isWinner('X')) {
            System.out.println("X is the winner!");
        } else if (game.isWinner('O')) {
            System.out.println("O is the winner!");
        } else if (game.isCat()) {
            System.out.println("It's a draw!");
        }
    }
}

