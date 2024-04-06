package game.chess.application;

import game.chess.board.Board;

/**
 * PlayGame - main class to start the game
 *
 * @author Harry Hainsworth-Staples
 */
public class PlayGame {
    public static void main(String[] args) {

        Board b = new Board(8, 8);

        b.initialiseBoard();
        b.displayBoard();

    }
}
